package com.employee.employeeManagementSystem.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
      static Connection conn=null;
      static Statement stmt;
        
      
       public static Statement getconnection() {
    	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","1234");
		stmt = conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	   return stmt;
       }
       
   	public static void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
      
      
	
	
}
