package com.controller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.util.proposal_DButil;





@WebServlet("/add_proposal_servlel")
public class add_proposal_servlel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
			  
		    // Initialize the database
		    Connection con = (Connection) proposal_DButil.initializeDatabase();

		    // Create a SQL query to insert data into demo table
		    // demo table consists of two columns, so two '?' is used
		    PreparedStatement st = (PreparedStatement) con
		           .prepareStatement("insert into eventplanner (Etitle,sponsor,location,date, cost,name,phoneNo) values (?, ?, ?, ?, ?,  ?, ?)");

		    // For the first parameter,
		    // get the data using request object
		    // sets the data to st pointer
		    st.setString(1,(request.getParameter("title")));
		    st.setString(2,(request.getParameter("sponsor")));
		    st.setString(3,(request.getParameter("location")));
		    st.setString(4,(request.getParameter("date")));
		    st.setString(5,(request.getParameter("cost")));
		    st.setString(6,(request.getParameter("name")));
		    st.setString(7,(request.getParameter("phone")));
		   
		    
	
		    int i = st.executeUpdate();
		    if (i>0) {
		    	System.out.println("Error");
		    	response.sendRedirect("JSP/searchProposal.jsp");
		    	
		    	}
			}
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
		    
		    	
		    
		
		
		
		
	
		
	}
}









