package com.calvinklein.rewards.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.calvinklein.rewards.model.Address;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * 
 * This Class inserts member information from in to database, when member tries
 * to register.
 *
 */

public class MemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional

	/**
	 * This methods register members details in member table
	 * 
	 * @param member
	 * @return int
	 * @throws Exception
	 */
	public boolean registerMember(Member member, Address address, User user) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(member);
			user.setMemberId(member.getMemberId());
			address.setMemberId(member.getMemberId());
			session.save(user);
			session.save(address);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This Class Retrieves the member information from database, when member
	 * tries to login.
	 * 
	 * @param memberID
	 * @return Member
	 */
	@Transactional
	public Member getMember(int memberId) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Member where memberId = :memberId");
		query.setInteger("memberId", memberId);
		List<Member> list = query.list();

		Member member = new Member();
		member.setMemberId((list.get(0).getMemberId()));
		member.setFirstName(list.get(0).getFirstName());
		member.setLastName(list.get(0).getLastName());
		member.setEmailId(list.get(0).getEmailId());
		member.setGender(list.get(0).getGender());
		member.setMaritalStatus(list.get(0).getMaritalStatus());
		member.setDob(list.get(0).getDob());
		member.setPhone(list.get(0).getPhone());
		member.setMemshipNumber(list.get(0).getMemshipNumber());
		member.setIncome(list.get(0).getIncome());
		member.setStoreId(list.get(0).getStoreId());

		/*
		 * Query query1 = session.createQuery(
		 * "from Address where memberId = :memberId");
		 * query.setInteger("memberId", memberId); List<Address> list1 =
		 * query.list();
		 * 
		 * Address address = new Address();
		 * address.setMemberId(list1.get(0).getMemberId());
		 * address.setCountry(list1.get(0).getCountry());
		 * address.setState(list1.get(0).getState());
		 * address.setAddress1(list1.get(0).getAddress1());
		 * address.setAddress2(list1.get(0).getAddress2());
		 * address.setCity(list1.get(0).getCity());
		 * address.setZip(list1.get(0).getZip());
		 * 
		 * member.setAdr(address);
		 * 
		 * Query query2 = session.createQuery(
		 * "from User where memberId = :memberId"); query.setInteger("memberId",
		 * memberId); List<User> list2 = query.list();
		 * 
		 * User user1 = new User();
		 * user1.setMemberId((list2.get(0).getMemberId()));
		 * user1.setEmail(list2.get(0).getEmail());
		 * user1.setPassword(list2.get(0).getPassword());
		 * 
		 * member.setAdr(address);
		 */

		return member;

	}

	@Transactional
	public boolean getEmail(String email) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select memberId from User where emailId = :email");
		query.setString("email", email);
		List<Integer> list = query.list();
		try {
			int memberId = list.get(0);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}

	}
}
