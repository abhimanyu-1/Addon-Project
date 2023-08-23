package com.jdbcApp.java;

import java.sql.*;

public class Read {
	
	public static void main(String[] args) {
		
		DbConnector obj= new DbConnector();
		Connection con = obj.db_Connect();
		try
		{
			String query="select * from student";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) 
			{
				System.out.println(rs.getString("S_id"));
				System.out.println(rs.getString("Name"));
				System.out.println(rs.getString("Email"));
				System.out.println(rs.getString("Department"));
				System.out.println("__________________");
			}
		}
		catch(Exception e)
		{
	}
}
}
