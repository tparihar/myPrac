package com.ck.reward.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.reward.entities.Account;
import com.ck.reward.entities.Address;
import com.ck.reward.entities.Income;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.StoreEmail;

/**
 * 
 * @author Bootcamp User 03 
 * It contains methods that retrieves and stores member information.
 */
@Repository
public class MemberDao {

	

	@Autowired
	private SessionFactory sessionFactory;
	
	
	private static final Logger logger=LogManager.getLogger(MemberDao.class);
	
	/**
	 * 
	 * @param username
	 * @return
	 * @throws SQLException
	 * 
	 * Returns true if username exists in the table.
	 */
	public boolean findUserId(String username) throws SQLException {

		Query query = sessionFactory.getCurrentSession().createQuery("from Account where username=?");
		query.setString(0, username).uniqueResult();
		
		return query.uniqueResult() != null;

	}
	

	/**
	 * 
	 * @param member
	 * @return
	 * @throws SQLException
	 * Stores new member account.
	 * Stores member related informations.
	 */
	
	public void save(Member member) {

		Account account = member.getAccount();
		Address address = member.getAddress();
		member.getProfile().setMember(member);
		
		
		
		member.getSubscribedEmail().forEach((x)->{
			x.setMember(member);
		});
		
		Session session=sessionFactory.getCurrentSession();
		
		
		session.save(account);
		
		session.save(address);
		
		//sessionFactory.getCurrentSession().save(member.getStoreEmails());
	/*	member.getStoreEmails().forEach((x)->{
			StoreEmail email=session.load(StoreEmail.class, x.getId());
			storeEmail.add(email);
			logger.info(x.getId());
			logger.info(x.getName());
		});*/
		//member.setStoreEmails(storeEmail);
		session.save(member);
		
		

	}

	

	/**
	 * 
	 * @return
	 * @throws SQLException
	 * 
	 *  Retrieves income range.
	 */
	@SuppressWarnings("unchecked")
	public List<Income> getIncomeRange() throws SQLException {

		return sessionFactory.getCurrentSession().createQuery("from Income").list();
		
	}
	
	
	/**
	 * 
	 * @param account
	 * @return
	 * Retrieves member details
	 */
	public Member getMember(Account account) {
		
		return sessionFactory.getCurrentSession().get(Member.class, account.getId());

	}
	
	
	/** 
	 * @param account
	 * @return
	 * @throws SQLException
	 * 
	 * Check if requested account exists in the table or not
	 */
	public boolean checkAccountExist(Account account) throws SQLException {

		Query query = sessionFactory.getCurrentSession()
									.createQuery("select ac.id from Account ac where ac.username=? and ac.password=?");
		
		query.setString(0, account.getUsername());		
		query.setString(1, account.getPassword());
		Integer accountId =(Integer) query.uniqueResult();
		
		if (accountId != null) {
			account.setId(accountId);
			
			return true;
		}		

		return false;

	}

}
