package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.db.DBConnect;
import com.entity.appointment;


   

import java.sql.Statement;



public class AppointementDao {
	
	           
	
	public int ajouterAppointement(appointment p) {
        int result = 0;
        String query = "INSERT INTO hospital.appointment ( idRendezVous,username, dateDdv,  heure, statut, motif) VALUES (?,?, ?, ?,?, ?)";
        try {
            Connection coon = DBConnect.getCoon();
          
            PreparedStatement pst = coon.prepareStatement(query);

            pst.setInt(1, p.getIdRendezVous());
            pst.setString(2, p.getUsername());
            pst.setDate(3, p.getDateDdv());
            pst.setString(4, p.getHeure());
            pst.setString(5, p.getStatut());
            pst.setString(6, p.getMotif());

           result = pst.executeUpdate();
          
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
	
	
	          
	
	public static ArrayList<appointment> getAllAppointement (){
        ArrayList <appointment> p = new ArrayList<appointment>();

        try {
            Connection coon= DBConnect.getCoon();
            
           
            Statement smt = coon.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM hospital.appointment");

            while(rs.next()) {
            	appointment ppst = new appointment();

                
            	ppst.setIdRendezVous(rs.getInt("idRendezVous"));
            	ppst.setUsername(rs.getString("username"));
            	ppst.setDateDdv(rs.getDate("dateDdv"));
            	ppst.setHeure(rs.getString("heure"));
            	ppst.setStatut(rs.getString("statut"));
            	ppst.setMotif(rs.getString("motif"));
            	p.add(ppst); 

            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        


        return p;

    }

}
