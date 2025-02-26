<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ include  file="component/allCss.jsp" %>
    <title>Prendre un Rendez-vous</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

   <%@ include file="../admin/navbar.jsp" %>
   
   
     

    <!-- Formulaire -->
    
    <div class="container mt-5">
        <h2 class="text-center">Prendre un Rendez-vous</h2>
        <p class="text-center">Remplissez le formulaire ci-dessous pour réserver un rendez-vous.</p>

        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-lg border-0">
                    <div class="card-body">
                    
                    
                        <form action="AddAppointement" method="post">
                           
                            <!-- Champ Username -->
                            <div class="mb-3">
                                <label for="username" class="form-label">Username</label>
                                <input type="text" class="form-control" id="username" name="username" required>
                            </div>

                            <!-- Champ Date du rendez-vous -->
                            <div class="mb-3">
                                <label for="date" class="form-label">Date du rendez-vous</label>
                                <input type="date" class="form-control" id="date" name="date" required>
                            </div>

                            <!-- Champ Heure du rendez-vous -->
                            <div class="mb-3">
                                <label for="heure" class="form-label">Heure du rendez-vous</label>
                                <input type="time" class="form-control" id="heure" name="heure" required>
                            </div>

                            <!-- Champ Statut -->
                            <div class="mb-3">
                                <label for="statut" class="form-label">Statut</label>
                                <select class="form-control" id="statut" name="statut" required>
                                    <option value="En attente">En attente</option>
                                    <option value="Confirmé">Confirmé</option>
                                    <option value="Annulé">Annulé</option>
                                </select>
                            </div>

                            <!-- Champ Motif -->
                            <div class="mb-3">
                                <label for="motif" class="form-label">Motif du rendez-vous</label>
                                <textarea class="form-control" id="motif" name="motif" rows="3" required></textarea>
                            </div>

                            <!-- Bouton Soumettre -->
                            <div class="d-grid">
                                <button type="submit" class="btn btn-success">Reserver</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

