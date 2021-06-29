package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.proposal;
import com.util.proposal_DButil;



@WebServlet("/search_Proposal_servlet")
public class search_Proposal_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String title =  request.getParameter("title");

		try {
			
			
			
			List<proposal> photDetails = proposal_DButil.search(title);
			request.setAttribute("photDetails",photDetails);
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dis = request.getRequestDispatcher("JSP/ProposalDetails.jsp");
	
			dis.forward(request, response);
		
		
	}

}
