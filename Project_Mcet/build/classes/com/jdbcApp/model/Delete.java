package com.jdbcApp.java;

import java.sql.*;



public class Delete {
	public static void main(String[] args) {
		DbConnector obj= new DbConnector();
		
		Connection con = obj.db_Connect();
		
		try
		{
			String query="delete from student where S_id=3";
			PreparedStatement ps = con.prepareStatement(query);
			int i = ps.executeUpdate(); //data stores to db
			
			if(i!=0)
			{
				System.out.println("Deleted Successfully");
			}
		}
		catch(Exception e) {
			
		}
	}
}
