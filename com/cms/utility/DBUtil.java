package com.cms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.Driver;

public class DBUtil {
	
	public static Connection provideConnection() {
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/monitoringsystem";
		
		try {
			conn = DriverManager.getConnection(url,"root","sukh78#S");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		return conn;
		
	}

}
