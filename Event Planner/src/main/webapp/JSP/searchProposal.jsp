<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>event planing</title>
  <link rel="stylesheet" href="../styles/addpackage.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body style="background-image:url('../img/e11.jpg');">

  
	<div>
		<div class="header">
			<div class="logo">
				<h2>Dream Event Planner</h2>
			</div>

   </div><br><br>
   <div class="title">
    <h1>Search Proposal</h1>
  </div><br><br>
  <div class="package">
  
  
  <form action="<%=request.getContextPath() %>/search_Proposal_servlet" method="post"  >
<h3  style="color:black;font-family:sans-serif">Proposal_Title<input type="text" name ="title" class="fullnamep"></h3><br>

<input type="submit" name ="submit" value="SEARCH" style="padding:10px;color:white;background-color: #800080">       

</form>
  
    </div>
  </body> 
  </html>