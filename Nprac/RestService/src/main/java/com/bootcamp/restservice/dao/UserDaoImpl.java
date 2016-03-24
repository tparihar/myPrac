package com.bootcamp.restservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.bootcamp.restservice.model.User;
import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;


@Repository
public class UserDaoImpl implements UserDao{
	
	
	
	@Autowired
	private CassandraOperations cassandraOperations;
	
	

	public User fetchByPId(int id){
	Select select = QueryBuilder.select().from("user");
			  select.where(QueryBuilder.eq("id", id));
	User user= cassandraOperations.selectOne(select, User.class);
	return user;
			  
	}
	
	public List<User> getAll(){
		String select = "select * from user";

		List<User> users = cassandraOperations.select(select, User.class);
		return users;
	}

}
