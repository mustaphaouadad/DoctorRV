package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DBConnect;
import com.entity.appointment;

public class AppointementDao {
	
	           
	
	public int ajouterAppointement(appointment p) {
        int result = 0;
        String query = "INSERT INTO hospital.appointment ( idRendezVous,username, dateDdv,  heure, statut, motif) VALUES (?,?, ?, ?,?, ?)";
        try {
            Connection coon = DBConnect.getCoon();
            if(coon == null) {
                System.out.println("database not connected!!");
                return 0; // Arrêter ici si la connexion est nulle
            } else {
                System.out.println("Connexion réussie à la base de données !");
            }
            PreparedStatement pst = coon.prepareStatement(query);

            pst.setInt(1, p.getIdRendezVous());
            pst.setString(2, p.getUsername());
            pst.setDate(3, p.getDateDdv());
            pst.setString(4, p.getHeure());
            pst.setString(5, p.getStatut());
            pst.setString(6, p.getMotif());

           result = pst.executeUpdate();
           System.out.println("Nombre de lignes insérées : " + result);
            // Retourne 1 si l'insertion a réussi
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result; // Retourne 0 en cas d'échec
    }

}
