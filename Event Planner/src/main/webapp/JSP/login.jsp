<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>

<head >           	<!-- to validate the fields in the form before the form is submitted-->

		 <link rel="stylesheet" href="../styles/addpackage.css">									
 		
<script                       
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js">
</script>

<meta charset="utf-8">

<title>Event Planner</title>
</head>
<body style="background-image:url('../img/e6.jpg');repeat:no repeat;">

	<div class="new">
		<div class="header">
			<div class="logo">
				<h2>Dream Event Planner</h2>
			</div>
	  
   <br><br>  <br><br>  <br><br>
    <div style="text-align: center">
        <h1>Event Planner Login</h1><br><br>
        <form action="<%=request.getContextPath() %>/login" method="post">
             <label class="fname" for="Username">Username:</label>
            <input  class="fullname" name="username" size="30" />
            <br><br>
            <label class="fname" for="password">Password:</label>
            <input  class="fullname" type="password" name="password" size="30" />
            <br>${message}        <!-- to display the message sent from the server – typically to tell the user that the login failed.  -->
            <br><br>           
            <button type="submit" class="send-btn" >Login</button>
        </form>
    </div>
    
    <script type="text/javascript">       /*validates the email and password fields are not empty, and the user must 
    										enter a valid email address*/
 	 $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                email: {
                    required: true,
                    email: true
                },
         
                password: "required",
            },
             
            messages: {
                email: {
                    required: "Please enter email",
                    email: "Please enter a valid email address"
                },
                 
                password: "Please enter password"
            }
        });
 
    });
</script>
    
</body>
</html>