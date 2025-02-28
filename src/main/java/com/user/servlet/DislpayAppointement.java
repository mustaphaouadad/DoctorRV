package com.user.servlet;

import java.io.IOException;

import java.util.List;

import com.dao.AppointementDao;
import com.entity.User;
import com.entity.appointment;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


 
@WebServlet("/DislpayAppointement")
public class DislpayAppointement extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<appointment> p = AppointementDao.getAllAppointement() ;
		 HttpSession session = request.getSession();
		 session.setAttribute("adminObj", new User());
	        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/index.jsp");
	        request.setAttribute("data", p);
	        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
