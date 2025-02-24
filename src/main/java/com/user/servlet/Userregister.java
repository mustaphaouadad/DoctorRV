package com.user.servlet;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/Userregister")
public class Userregister extends HttpServlet {
	
       
    

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 String Username=request.getParameter("Username");
			 String Telephone=request.getParameter("Telephone");
			 String email=request.getParameter("email");
			 String pass_word=request.getParameter("pass_word");
			 
			 User u=new User(Username, Telephone, email, pass_word);
			 UserDao dao=new UserDao(DBConnect.getCoon());
			 boolean f=dao.regestair(u);
			 
			 HttpSession session =request.getSession();
			 
			 
			 if (f) {
				 session.setAttribute("sucMsg","register succesfull");
				 response.sendRedirect("signup.jsp");
				
			} else {
				 session.setAttribute("errormsg","something wrong on server");
				 response.sendRedirect("signup.jsp");
				

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
