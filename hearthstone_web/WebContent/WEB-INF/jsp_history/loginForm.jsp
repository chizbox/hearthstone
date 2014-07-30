<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty user}">
	
	 <h3>User Login</h3>
	 <form action='loginForm.html' method="post">
	 	<table>
	 		<tr>
	 			<td>Username:</td>
	 			<td><input type='text' name='username' value='${loginForm.username}' /></td>
	 		</tr>
	 		
	 		<tr>
	 			<td>Password:</td>
	 			<td><input type='text' name='password' value='${loginForm.password}'/></td>
	 		</tr>
	 		
	 		<tr>
	 			<td>
	 				<input type='submit' name='submit' value='Submit'/>
	 			</td>
	 		</tr>
	 	</table>
	 </form>
	 </c:if>
	 
	 <c:if test="${not empty user}">
	 		 <h3>You are currently logged in as ${user.username}</h3>
	 		  <form action='logout.html' method="post">
	 		  		<td>
	 					<input type='submit' name='submit' value='Logout'/>
	 				</td>
	 		  </form>
	 </c:if>
</body>
</html>