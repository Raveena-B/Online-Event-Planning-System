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
<body>
<div class="new">

<center><h1 class="h2">Proposals</h1></center>

<table style="padding:5px;margin:5px">
<tr>
<th style="background-color:#ffcc00" >Event_Title</th></t>
<th style="background-color:#ffcc00">Sponsor_Of_Event</th>
<th style="background-color:#ffcc00">Event_location</th>
<th style="background-color:#ffcc00">Date_Time</th>
<th style="background-color:#ffcc00">Cost_Of_Event</th>
<th style="background-color:#ffcc00">Contact_Name</th>
<th style="background-color:#ffcc00">Contact_phoneNo</th>



</tr>
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
<td style="background-color:white"><%=resultSet.getString(1) %></td>
<td style="background-color:white"><%=resultSet.getString(2) %></td>
<td style="background-color:white"><%=resultSet.getString(3) %></td>
<td style="background-color:white"><%=resultSet.getString(4) %></td>
<td style="background-color:white"><%=resultSet.getString(5) %></td>
<td style="background-color:white"><%=resultSet.getString(6) %></td>
<td style="background-color:white"><%=resultSet.getString(7) %></td>


</tr>
<%
i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<br><br><br>
	<center><form method="post" action="<%=request.getContextPath() %>/delete_Proposal_servlet">
	<center><input type="submit" value="Delete" style="padding:10px;color:white;background-color:red"></center>	
	</form></center><br>
	<center><button  onclick="document.location.href='JSP/updateProposal.jsp'" style="padding:10px;color:white;background-color:blue" >Update</button></center><br><br><br>
	
	</div>
</body>
</html>

