package com.calvinklein.rewards.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.calvinklein.rewards.model.User;

/**
 * 
 * This Class Retrieves the member information from database, when member tries
 * to login.
 *
 */
public class LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional

	/**
	 * This Class Retrieves the User information from database, when User tries
	 * to login.
	 * 
	 * @param emailId
	 * @return User
	 */
	public User getLoginInfo(String emailId) {

		User user = new User();
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("from User where emailid = :emailId");
		query.setString("emailId", emailId);
		List<User> list = query.list();
		try {
			user.setMemberId((list.get(0).getMemberId()));
			user.setPassword((list.get(0)).getPassword());
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return user;
	}
}
