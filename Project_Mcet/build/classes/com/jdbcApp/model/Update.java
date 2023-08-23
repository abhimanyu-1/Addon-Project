package com.jdbcApp.java;

import java.sql.*;

public class Update {
	public static void main(String[] args) {
		
		DbConnector obj= new DbConnector();	
		Connection con = obj.db_Connect();
		
		try
		{
			String query="update student set email= ? where S_id=1";
			PreparedStatement ps = con.prepareStatement(query);
			
			 ps.setString(1,"vishnu@gmail.com");			
			int i = ps.executeUpdate(); //data stores to db
			
			if(i!=0)
			{
				System.out.println("Updated Successfully");
			}
		}
		catch(Exception e) {
			
		}
	}
}
