package com.bootcamp.restservice.dao;

import java.util.List;

import com.bootcamp.restservice.model.User;


public interface UserDao{
	
	public User fetchByPId(int id);
	
	public List<User> getAll();

}
