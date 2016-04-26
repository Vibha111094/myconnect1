package com.betsol.service;

import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONObject;

import com.portal.model.Users;

public class database_create {
	private static int id = 0;
	public int create(User user) { 
		user.setId(id++);
		database_connections.setUp();	  
	    JSONObject jsonObject;	 
	    Statement statement;
	      try {  
			statement.executeUpdate("INSERT INTO user_info VALUES " +
					 "('" + user.getId() + "', '"
							+ user.getFirst_name() + "', '"
							+ user.getLast_name() + "', '"
							+ user.getAddress() + "', '"
							+ user.getDob() + "', '"
							+ user.getBlood_group() + "', '"
							+ user.getPhone_number() + "', '"
							+ user.getUsername() + "', '"
							+ user.getPassword() + "');");
	      } catch (SQLException e) {
			System.out.println(e.getMessage());
	      } catch (Exception e) {
	    	  System.out.println(e.getMessage() + "Exception generated");  
	      }
	}

}
