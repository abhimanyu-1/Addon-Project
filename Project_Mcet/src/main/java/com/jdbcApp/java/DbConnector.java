package com.jdbcApp.model;
import java.sql.*;

import org.eclipse.jdt.internal.compiler.batch.Main;
public class DbConnector {
	
	public Connection db_Connect ()
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
		}
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
			System.out.println(con);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
		}
		public static void main(String[] args) 
		{
			DbConnector obj = new DbConnector();
			obj.db_Connect();
		}
	}
