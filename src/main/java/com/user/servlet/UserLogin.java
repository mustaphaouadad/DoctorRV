package com.user.servlet;

import java.io.IOException;


import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;;

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		 
		
		 UserDao dao=new UserDao(DBConnect.getCoon());
		 User user=dao.login(email, password);

		if (user!=null) {
			session.setAttribute("userObj", user);
			response.sendRedirect("ListePatient.jsp");
		} else {
			session.setAttribute("errorMsg", "invalid email & password");
			response.sendRedirect("user_login.jsp");
		}
		
	}

	
	

}
