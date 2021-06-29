package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Login;


public class UserDAO {

    public boolean validate(Login loginBean) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/eventplanner?useSSL=false", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                .prepareStatement("select * from user where username = ? and password = ? ")) {
                preparedStatement.setString(1, loginBean.getUsername());
                preparedStatement.setString(2, loginBean.getPassword());

                System.out.println(preparedStatement);
                ResultSet rs=preparedStatement.executeQuery();
                status = rs.next();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return status;
        }

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}
}
