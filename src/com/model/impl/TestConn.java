package com.model.impl;
import java.sql.*;
public class TestConn {

	public static void main(String[] args) {
		Connection conn = null;
		
		try{
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","MrDbaMan");
			if(conn != null){
				System.out.println("Connection Established");
			}else{
				System.out.println("Connection Failed");
			}
	} catch(Exception e){
		e.printStackTrace();
	}finally{
		if(conn != null){
			try {
				conn.close();
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
	}

}
