package com.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			if (i>0) {
				f=true;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	    
	
	public User login(String em, String psw) {
		User u = null;

		try {
			String sql = "select * from user_dtls where email=? and pass_word=?";
			PreparedStatement ps = coon.prepareStatement(sql);
			ps.setString(1, em);
			ps.setString(2, psw);
			
			ResultSet rs=ps.executeQuery();

			

			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setTelephone(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPass_word(rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}
	
	
	 	 	

}
