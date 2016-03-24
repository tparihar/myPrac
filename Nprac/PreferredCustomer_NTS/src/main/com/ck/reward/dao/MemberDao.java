package com.ck.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ck.reward.entities.Address;
import com.ck.reward.entities.Income;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.Profile;
import com.ck.reward.entities.Store;
import com.ck.reward.util.DBUtility;
import com.ck.reward.util.QueryResult;
import com.ck.reward.util.UpdateResult;

/**
 * 
 * @author Bootcamp User 03 
 * It contains methods that handles member information  on database.
 */
public class MemberDao {

	/**
	 * 
	 * @param member
	 * @return
	 * @throws SQLException
	 * 
	 *Records member information in the member table
	 */
	public boolean createMember(Member member) throws SQLException {

		UpdateResult result = DBUtility
				.save("insert into ck.member(id,account_id,firstname,lastname,phone,email,storeId) values(?,?,?,?,?,?,?)",
						new Object[] { member.getId(), member.getAccountId(), member.getFirstName(),
								member.getLastName(), member.getPhone(), member.getEmail(),
								member.getStore().getId() });

		if (result.affectedRows().length < 1) {
			throw new SQLException("Data was not inserted");
		}
		result.close();

		return true;
	}

	/**
	 * 
	 * @param address
	 * @param accountId
	 * @return
	 * @throws SQLException
	 * 
	 * Records member address in the address table
	 */

	public boolean saveAddress(Address address, String accountId) throws SQLException {

		UpdateResult result = DBUtility.save("insert into ck.address(account_id,address1,address2,city,zip,country_id,state_id) values(?,?,?,?,?,?,?)",
											new Object[] { accountId, address.getAddress1(), address.getAddress2(), address.getCity(),
														   address.getZip(), address.getCountryId(), address.getStateId() });

		if (result.affectedRows().length < 1) {
			throw new SQLException("Data failed to insert in member table");
		}

		result.close();
		return true;

	}

	/**
	 * 
	 * @param accountId
	 * @return
	 * @throws SQLException
	 * 
	 * Retrieves member information for given account id.
	 */
	public Member getMember(String accountId) throws SQLException {

		Member member = null;
		
		QueryResult result = DBUtility.queryBy("select A.id,A.account_id,A.firstname,A.lastname,A.email,A.phone,A.storeId,B.name from ck.member A left join ck.store B on (A.storeId=B.id) where A.account_id=? ",
												new Object[] { accountId });
		
		ResultSet resultSet = result.getResultSet();
		
		if (resultSet.next()){
			Store store = new Store();
			store.setId(resultSet.getString("storeId"));
			store.setName(resultSet.getString("name"));
			member = new Member();
			member.setAccountId(accountId);
			member.setId(resultSet.getString("id"));
			member.setFirstName(resultSet.getString("firstname"));
			member.setLastName(resultSet.getString("lastname"));
			member.setEmail(resultSet.getString("email"));
			member.setPhone(resultSet.getString("phone"));			
			member.setStore(store);
		}
		result.close();

		return member;

	}

	/**
	 * 
	 * @param emailId
	 * @param accountId
	 * @return
	 * @throws SQLException
	 *             Saves member's choice of email preference in the table
	 */
	public boolean saveEmailPreference(String[] emailId, String accountId) throws SQLException {

		List<Object[]> objectList = new ArrayList<>();
		
		for (String storeEmailId : emailId) {
			objectList.add(new Object[] { accountId, storeEmailId });
		}
		
		int count = objectList.size();

		UpdateResult result = DBUtility.batchSave("insert into ck.email_subscription(account_id,store_email_id) values(?,?)", objectList);
		
		if (result.affectedRows().length != count) {
			throw new SQLException("Email Preference profile record insertion failure");
		}		
		result.close();

		return true;
	}

	/**
	 * 
	 * @param profile
	 * @param accountId
	 * @return
	 * @throws SQLException
	 * Records member's profile information in the table
	 */
	public boolean saveProfile(Profile profile, String accountId) throws SQLException {

		UpdateResult result = DBUtility.save("insert into ck.profile(account_id,gender,marital_status,birth_day,birth_month,income_range) values(?,?,?,?,?,?)",
											new Object[] { accountId, profile.getGender(), profile.getMaritalStatus(), profile.getBirthDay(),
															profile.getBirthMonth(), profile.getIncomeRange() });
		
		if (result.affectedRows().length < 1) {
			throw new SQLException("Profile record insertion failure");
		}
		result.close();

		return true;
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 * 
	 * Records member information regarding his/her income range
	 */
	public List<Income> getIncomeRange() throws SQLException {

		List<Income> incomeRange = new ArrayList<Income>();

		QueryResult result = DBUtility.queryBy("select id,amount_range from ck.income_range", new Object[] {});
		
		ResultSet resultSet = result.getResultSet();
		
		while (resultSet.next()) {
			Income income = new Income();
			income.setId(resultSet.getString("id"));
			income.setRange(resultSet.getString("amount_range"));
			incomeRange.add(income);

		}
		result.close();

		return incomeRange;

	}

}
