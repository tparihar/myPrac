package com.calvinklein.rewards.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.util.DatabaseConnection;

/**
 * 
 * This Class Retrieves the member information from database, when member tries
 * to login.
 *
 */
public class MemberDataDao {
	/**
	 * This Class Retrieves the member information from database, when member
	 * tries to login.
	 * 
	 * @param memberID
	 * @return Member
	 */
	public Member getMemberInfo(int memberID) {
		ResultSet rs;
		Member member = new Member();

		try {
			PreparedStatement pst = DatabaseConnection.getConnection()
					.prepareStatement("select * from member where member_id=?");
			pst.setInt(1, memberID);
			rs = pst.executeQuery();

			while (rs.next()) {
				member.setFirstName(rs.getString(2));
				member.setLastName(rs.getString(3));
				member.setEmailID(rs.getString(4));
				member.setGender(rs.getString(5));
				member.setMaritalStatus(rs.getString(6));
				member.setDOB(rs.getString(7));
				member.setPhone(rs.getString(8));
				member.setMemshipNumber(Integer.parseInt(rs.getString(9)));
				member.setIncome(rs.getString(10));
				member.setStoreId(rs.getString(11));
			}
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
		return member;
	}
}
