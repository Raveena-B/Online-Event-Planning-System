package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.proposal_DButil;




@WebServlet("/delete_Proposal_servlet")
public class delete_Proposal_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String title = request.getParameter("title");
		
		
		
		
		boolean istru;
		istru =proposal_DButil.DeletPhotographer(title);

		if(istru==true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("JSP/ProposalDetails.jsp");
			dis.forward(request, response);
		}
		
		
		
		
	}

}
