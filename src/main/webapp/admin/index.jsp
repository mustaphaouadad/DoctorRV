<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="com.entity.*" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.paint-card{
box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
}
</style>
<%@ include  file="../component/allCss.jsp" %>
</head>
<body>
<%@ include file="navbar.jsp" %>

                
                
                
                <c:if test="${ empty adminObj }">
		<c:redirect url="../admin_login.jsp"></c:redirect>
	</c:if>
              
              
              
              
              <div class="container p-5">
		<p class="text-center fs-3">Doctor Dashboard</p>
		
		<c:if test="${not empty errorMsg}">
			<p class="fs-3 text-center text-danger">${errorMsg}</p>
			<c:remove var="errorMsg" scope="session" />
		</c:if>
		<c:if test="${not empty succMsg}">
			<div class="fs-3 text-center text-success" role="alert">${succMsg}</div>
			<c:remove var="succMsg" scope="session" />
		</c:if>
		
		
		
		
		
		         
		         <div class="container mt-5">

       <% ArrayList <appointment> p  = (ArrayList<appointment>) request.getAttribute("data"); %>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<div class="container mt-5">
  <div class="table-responsive">
    <table class="table table-striped table-bordered text-center align-middle">
      <thead class="table-dark">
        <tr>
          <th scope="col">Username</th>
          <th scope="col">La Date</th>
          <th scope="col">Heure</th>
          <th scope="col">Statut</th>
          <th scope="col">Motif</th>
          <th scope="col" colspan="2">Actions</th>
        </tr>
      </thead>
      <tbody>
        <% if (p != null && !p.isEmpty()) { %>
          <% for (appointment temp : p) { %>
            <tr>
              <td><%= temp.getUsername() %></td>
              <td><%= temp.getDateDdv() %></td>
              <td><%= temp.getHeure() %></td>
              <td>
                <span class="badge 
                  <%= temp.getStatut().equals("Confirmé") ? "bg-success" : 
                      temp.getStatut().equals("Annulé") ? "bg-danger" : 
                      "bg-secondary" %>">
                  <%= temp.getStatut() %>
                </span>
              </td>
              <td><%= temp.getMotif() %></td>
              <td>
                <a href="#" 
                   class="btn btn-sm btn-warning">
                  <i class="bi bi-pencil-square"></i> Edit
                </a>
              </td>
              <td>
                <a href="#" 
                   class="btn btn-sm btn-danger">
                  <i class="bi bi-trash"></i> Delete
                </a>
              </td>
            </tr>
          <% } %>
        <% } else { %>
          <tr>
            <td colspan="7">Aucun rendez-vous trouvé.</td>
          </tr>
        <% } %>
      </tbody>
    </table>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    </div>
		
		




			

		</div>
	

              

</body>
</html>