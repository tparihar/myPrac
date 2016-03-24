package com.bootcamp.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.restservice.dao.UserDaoImpl;
import com.bootcamp.restservice.model.User;

@Service("userService")
public class UserDetailImpl implements UserDetail {
	@Autowired
	private UserDaoImpl userDao;

	/* private UserDaoImpl userDao; */
	/*
	 * @Autowired private UserDao userDao;
	 */

	/**
	 * @param userdaoImpl
	 *            the userdaoImpl to set
	 */
	/*
	 * public void setUserdaoImpl(UserDaoImpl userdaoImpl) { this.userdaoImpl =
	 * userdaoImpl; }
	 */

	public User get(int id) {

		// User user=userDao.fetchByPId(id);
		User user = userDao.fetchByPId(id);
		return user;

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
