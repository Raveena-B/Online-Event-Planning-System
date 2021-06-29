package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Login;
import com.util.UserDAO;


@WebServlet("/login")
public class Login_servlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    private UserDAO loginDao;

    public void init() {
        loginDao = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
    	PrintWriter pw=response.getWriter();
    	
    	
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Login loginBean = new Login();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                response.sendRedirect("JSP/Proposal.jsp");
            } else {
                @SuppressWarnings("unused")
				HttpSession session = request.getSession();
                //session.setAttribute("user", username);
                pw.println("Login Failed...!");
                response.sendRedirect("JSP/loginFail.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

