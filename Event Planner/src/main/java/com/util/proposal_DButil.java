package com.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.proposal;
import com.mysql.jdbc.Statement;


  
// This class can be used to initialize the database connection
public class proposal_DButil {
    public static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = constants.DRIVER;
        String dbURL = constants.URL;
        // Database name to access
       
        String dbUsername = constants.username;
        String dbPassword = constants.password;
  
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL ,
                                                     dbUsername, 
                                                     dbPassword);
        return con;
    }
public static List<proposal> search(String title){
		
		ArrayList<proposal> hot =new ArrayList<>();
		
	
		
		String dbDriver = constants.DRIVER;
        String dbURL = constants.URL;
        // Database name to access
       
        String dbUsername = constants.username;
        String dbPassword = constants.password;
		
		try {
		
			Class.forName(dbDriver);
			
		
			Connection cone= DriverManager.getConnection(dbURL,dbUsername,dbPassword);
			Statement stat = (Statement) cone.createStatement();
			String sql = "SELECT * FROM eventplanner WHERE Etitle= '"+title+"'";
		
		    ResultSet rs =stat.executeQuery(sql);
		
		if(rs.next()) {
			String Etitle =rs.getString(1);
			String sponsor=rs.getString(2);
			String location=rs.getString(3);
			String date=rs.getString(4);
			String cost=rs.getString(5);
			String name=rs.getString(6);
			String phone=rs.getString(7);
			
				proposal h = new proposal(Etitle,sponsor,location,date,cost,name,phone);
				hot.add(h);
				
		}
			
		}
		catch(Exception e){ 
			e.printStackTrace();
		}
		
		

		 
		return hot;
	}
public static boolean DeletPhotographer(String title) {
	
	boolean isSuccess = false;
	
	String dbDriver = constants.DRIVER;
    String dbURL = constants.URL;
    // Database name to access
   
    String dbUsername = constants.username;
    String dbPassword = constants.password;

	
	
	try {
		
		Class.forName(dbDriver);
		
	
		Connection cone= DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		Statement stat = (Statement) cone.createStatement();
		
		String sql ="DELETE FROM eventplanner ";
		int rs = stat.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess = true;
			
		}
		else {
			isSuccess = false;
		}
	}
	
	catch(Exception e) 
	{
		
		e.printStackTrace();
	}
	
	
	
	
	return isSuccess;
	
}

public static boolean  updatePhotographer(String title,String Sponsor, String location, String date, String cost, String name,String phoneNo) {
	
	boolean issucses= false;
	 
	
	String dbDriver = constants.DRIVER;
    String dbURL = constants.URL;
    // Database name to access
   
    String dbUsername = constants.username;
    String dbPassword = constants.password;

	
	
	try {
		
		Class.forName(dbDriver);
		
	
		Connection cone= DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		Statement stat = (Statement) cone.createStatement();
	String sql = "UPDATE eventplanner set Etitle='"+title+"',Sponsor='"+Sponsor+"',location='"+location+"',date='"+date+"',cost='"+cost+"',name='"+name+"',phoneNo='"+phoneNo+"'"
			+ "Where Etitle='"+title+"'";

	 int rs =stat.executeUpdate(sql);
	 
	    if(rs>0) {
	    	issucses= true;
	    	
	    }
	    else {
	    	issucses= false;	
	    }
	
	
}
catch(Exception e){ 
	e.printStackTrace();
}
	 
	
	return issucses;
}



}

	
	


