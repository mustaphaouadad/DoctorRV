package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.User;

public class UserDao {
	
	private Connection coon;

	public UserDao(Connection coon) {
		super();
		this.coon = coon;
	}
	
	public boolean regestair(User u) {
		boolean f=false;
		try {
			String sql="insert into user_dtls(Username,Telephone,email,pass_word)values(?,?,?,?)";
			PreparedStatement ps=coon.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getTelephone());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPass_word());
			
			int i=ps.executeUpdate();
			if (i==0) {
				f=true;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	 	 	

}
