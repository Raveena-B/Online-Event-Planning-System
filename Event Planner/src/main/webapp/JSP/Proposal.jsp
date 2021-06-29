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
<body class="body">

  
	<div class="new">
		<div class="header">
			<div class="logo">
				<h2>Dream Event Planner</h2>
			</div>
	  
   </div>
   
   <div class="title">
    <h1>Add Event proposal</h1>
  </div>
  
  <div class="package">
  
  <center>
 
 <table style="width:20%;" class="fname">
<form action="<%=request.getContextPath() %>/add_proposal_servlel" method="post" >

<tr><td>     </td><td>Event title		</font>	</td><td> <input type="text" name ="title" class="fullname"></td></tr>
<tr><td>     </td><td>Sponsor of event	</font>	</td><td> <input type="text" name ="sponsor" class="fullname"></td></tr>
<tr><td>     </td><td>Event location 	 	</font>	</td><td> <input type="text" name ="location" class="fullname"></td></tr>
<tr><td>     </td><td>Date & time	 </font>	</td><td> <input type="text" name ="date" class="fullname"></td></tr>
<tr><td>     </td><td>Cost of the event </font>	 	</td><td> <input type="text" name ="cost" class="fullname"></td></tr>
<tr><td>     </td><td>Contact name	 		</font>		</td><td> <input type="text" name ="name" class="fullname"></td></tr>
<tr><td>     </td><td>contact phone No	</font>			</td><td> <input type="text" name ="phone" class="fullname"autofocus required pattern="[ 0-9]{10}" ></td></tr>


<tr><th>     </th><th><center>
<br><br>
<input type= "submit" name ="submit" value ="Add proposal"  class="send-btn" >
</center></th></tr></table></form>
  </center>
  
  
    </div>
  </body> 
  </html>