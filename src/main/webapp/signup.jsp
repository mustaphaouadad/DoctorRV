<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.paint-card{
box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
}
</style>
<%@ include  file="component/allCss.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="component/navbar.jsp" %>


<div class="container p-5"> 
<div class="row"> 
<div class="col-md-4 offset-md-4"> 
<div class="card paint-card"> 
<div class="card-body"> 
<p class="fs-4 text-center">User Register</p> 
 
<form action="Userregister" method="post"> 
<div class="mb-3"> 
<label class="form-Label">Username</label> <input required 
name="Username" type="text" class="form-control"> 
</div>
<div class="mb-3"> 
<label class="form-Label">Telephone</label> <input required 
name="Telephone" type="number" class="form-control"> 
</div>

<div class="mb-3"> 
<label class="form-Label">Email address</label> <input required 
name="email" type="email" class="form-control"> 
</div> 
<div class="mb-3"> 
<label class="form-Label">Password</label> <input required 
name="pass_word" type="password" class="form-control"> 
</div>
<button type="submit" class="btn bg-success text-white col-md-12">Register</button> 
</form> 
</div> 
</div> 
</div> 
</div> 
</div>

</body>
</html>