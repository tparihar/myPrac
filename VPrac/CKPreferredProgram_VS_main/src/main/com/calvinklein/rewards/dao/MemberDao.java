package com.calvinklein.rewards.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.util.DatabaseConnection;

/**
 * 
 * This Class inserts member information from in to database, when member tries
 * to register.
 *
 */
public class MemberDao {

	ResultSet rs;

	/**
	 * This methods register members details in member table
	 * 
	 * @param member
	 * @return int
	 * @throws Exception
	 */
	public int registerLoginDetails(Member member) throws Exception {

		int memberId = 0;
		String email = member.getMld().getEmail();
		String password = member.getMld().getPassword();

		if (email.length() == 0 || password.length() == 0) {
			throw new Exception("invalid");
		} else {
			try {

				PreparedStatement pst = DatabaseConnection.getConnection()
						.prepareStatement("Insert into login (emailid,password)values(?,?)");
				pst.setString(1, email);
				pst.setString(2, password);
				pst.executeUpdate();

				rs = pst.getGeneratedKeys();
				if (rs != null && rs.next()) {
					memberId = rs.getInt(1);
				}

			} catch (Exception e) {
				throw new Exception("Email already taken");
			} finally {
				DatabaseConnection.getConnection().close();
			}

			return memberId;
		}
	}

	/**
	 * This methods register members details in member table
	 * 
	 * @param member
	 * @param memberId
	 * @throws Exception
	 *
	 */
	public void registerMember(Member member, int memberId) throws Exception {

		String fname = member.getFirstName();
		String lname = member.getLastName();
		String email = member.getEmailID();
		String gender = member.getGender();
		String maritalStatus = member.getMaritalStatus();
		String DOB = member.getDOB();
		int memshipnumber = member.getMemshipNumber();
		String storeId = member.getStoreId();
		String memIncome = member.getIncome();
		String phone = member.getPhone();

		if (memberId == 0) {
			throw new Exception("invalid");
		} else {
			try {
				PreparedStatement pst = DatabaseConnection.getConnection()
						.prepareStatement("Insert into member values(?,?,?,?,?,?,?,?,?,?,?)");
				pst.setInt(1, memberId);
				pst.setString(2, fname);
				pst.setString(3, lname);
				pst.setString(4, email);
				pst.setString(5, gender);
				pst.setString(6, maritalStatus);
				pst.setString(7, DOB);
				pst.setString(8, phone);
				pst.setInt(9, memshipnumber);
				pst.setString(10, memIncome);
				pst.setString(11, storeId);

				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					DatabaseConnection.getConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This methods register members address in address table
	 * 
	 * @param member
	 * @param memberId
	 * @throws Exception
	 * 
	 */
	public void registerAddress(Member member, int memberId) throws Exception {

		String country = member.getAdr().getCountry();
		String state = member.getAdr().getState();
		String addr1 = member.getAdr().getAddress1();
		String addr2 = member.getAdr().getAddress2();
		String city = member.getAdr().getCity();
		String zip = member.getAdr().getZip();

		if (memberId == 0) {
			throw new Exception("invalid");
		} else {
			try {
				PreparedStatement pst = DatabaseConnection.getConnection()
						.prepareStatement("Insert into address values(?,?,?,?,?,?,?)");
				pst.setInt(1, memberId);
				pst.setString(2, country);
				pst.setString(3, state);
				pst.setString(4, addr1);
				pst.setString(5, addr2);
				pst.setString(6, city);
				pst.setString(7, zip);
				pst.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					DatabaseConnection.getConnection().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
