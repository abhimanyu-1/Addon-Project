package com.jdbcApp.java;

import java.sql.*;



public class Create {
	public static void main(String[] args) {
		DbConnector obj= new DbConnector();
		
		Connection con = obj.db_Connect();
		
		try
		{
			String query="insert into student (name,department,email) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,"manu");
			ps.setString(2,"PCA");
			ps.setString(3,"maan@gmail.com");
			
			int i = ps.executeUpdate(); //data stores to db
			
			if(i!=0)
			{
				System.out.println("Registered Successfully");
			}
		}
		catch(Exception e) {
			
		}
	}
}
