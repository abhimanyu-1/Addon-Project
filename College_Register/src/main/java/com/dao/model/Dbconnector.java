package com.dao.model;

import java.sql.*;

public class Dbconnector {
	public Connection db_connect()
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
	catch (Exception e)
	{
		System.out.println(e);
		
	}
	return con;
	}
	
	
	}


