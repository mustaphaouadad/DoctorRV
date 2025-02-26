package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import com.dao.AppointementDao;
import com.entity.appointment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AddAppointement")
public class AddAppointement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =request.getParameter("username");
		String dateDdv =request.getParameter("date");
		Date date=Date.valueOf(dateDdv);
		String heure=request.getParameter("heure");
		String statut=request.getParameter("statut");
		String motif=request.getParameter("motif");
		
		
		appointment p =new appointment();
		
		p.setUsername(username);
		p.setDateDdv(date);
		p.setHeure(heure);
		p.setStatut(statut);
		p.setMotif(motif);
		
		
		AppointementDao appointementDao = new AppointementDao();
        int result = appointementDao.ajouterAppointement(p);
        if (result > 0) {
        	response.sendRedirect("index.jsp");

        }else {
            PrintWriter out = response.getWriter();
            out.println("Data not added Successfully!!");
        }
		
		
		
		
		
		
		
	}

}
