package com.jdbcApp.java;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {

		DbConnector obj= new DbConnector();	
		Connection con = obj.db_Connect();
		
		try {
			
			String query="select * from student";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name:");
			String name=sc.next();
			while(rs.next()) {
				if(name.equals(rs.getString("Name")) ) {
					
					System.out.println("Sucessfully Login");
					break;
				}
				else {
					System.out.println("Login unsucessfull");
					break;
				}
			}
		}
		catch(Exception e) {
			
		}
	}
}
