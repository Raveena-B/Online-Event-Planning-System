<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "eventplanner";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel = "stylesheet"
   type = "text/css"
   href = "../styles/addpackage.css" />
   <title>Event planner</title>
 </head>
<body style="background-image:url('../img/e11.jpg');repeat:no repeat;">
<br>
<center><h1 class="h2">Proposals</h1></center>

<center><form method="post" action="<%=request.getContextPath() %>/update_Proposal_servlet">
<table style="padding:-50px;margin:-50px;top:20px">

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from eventplanner";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>

<tr>
<td class="text" >Etitle    :</td><td><input  type="text" name="title" value="<%=resultSet.getString(1) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">Sponsor    :</td><td><input type="text" name="sponsor" value="<%=resultSet.getString(2) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">location    :</td><td><input type="text" name="location" value="<%=resultSet.getString(3) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">date    :</td><td><input type="text" name="date" value="<%=resultSet.getString(4) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">cost    :</td><td><input type="text" name="cost" value="<%=resultSet.getString(5) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">name    :</td><td><input type="text" name="name" value="<%=resultSet.getString(6) %>" class="delete-btn"></td></tr><br>
<tr>
<td class="text">phoneNo    :</td><td><input type="text" name="phoneNO" value="<%=resultSet.getString(7) %>" class="delete-btn"></td></tr><br>



<%
i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table></center>
<br><br><br>
	<center>
	<input type="submit" value="Update" style="padding:10px;color:white;background-color:red">	
	</form></center><br>
	
</body>
</html>

