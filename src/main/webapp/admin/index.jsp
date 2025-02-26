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
       <table class="table">
  <thead>
    <tr>
      <th scope="col">Username</th>
      <th scope="col">La Date </th>
      <th scope="col">Heure </th>
      <th scope="col">Statut</th>
      <th scope="col">Motif</th>
      <th scope="col">Action</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>


  <% if (p!= null && !p.isEmpty()) { %>
    <% for (appointment temp : p) { %>
        <tr>
            <td><%= temp.getUsername() %> </td>
            <td><%= temp.getDateDdv() %> </td>
             <td><%= temp.getHeure()  %> </td>
            <td> <%= temp.getStatut()  %></td>
            <td> <%= temp.getMotif() %></td>
           <td><a type="button" href = "editAppointement?idRendezVous=<%= temp.getIdRendezVous() %>" class="btn btn-warning">edit</a></td>
            <td><a type="button" href="DeleteAppointement?idRendezVous=<%= temp.getIdRendezVous() %>" class="btn btn-danger">delete</a></td>
        </tr>
    <% } %>
<% } else { %>
    <tr><td colspan="2">Aucun rendez-vous trouvé.</td></tr>
<% } %>



  </tbody>
</table>

    </div>
		
		




			

		</div>
	

              

</body>
</html>