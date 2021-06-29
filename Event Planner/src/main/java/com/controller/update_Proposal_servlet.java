package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.proposal_DButil;



@WebServlet("/update_Proposal_servlet")
public class update_Proposal_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
		String Etitle = request.getParameter("title");
		String Sponsor = request.getParameter("sponsor");
		String location= request.getParameter("location");
		String date= request.getParameter("date");
		String cost= request.getParameter("cost");
		String name= request.getParameter("name");
		String phoneNO = request.getParameter("phoneNO");
		
		
		
	boolean isstru;
	
	
	isstru=proposal_DButil.updatePhotographer(Etitle, Sponsor, location, date, cost, name,phoneNO);

	
	if(isstru==true ) {
		RequestDispatcher dis = request.getRequestDispatcher("JSP/ProposalDetails.jsp");
		dis.forward(request, response);
		
	}
	
		
		
		
	}

}
