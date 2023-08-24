package com.dao.model;
import java.sql.*;
import com.bean.model.Register;

public class CollegeDao {
	
	Connection con = null;
	PreparedStatement p =null;
	Statement s = null;
	ResultSet rs = null;
	
	Dbconnector obj = new Dbconnector();
	public String regEmployee(Register robj)
	{
		try 
		{
			String query = "insert into employee(name,email,departmnet,username,password) values(?,?,?,?,?)";
			con = obj.db_connect();
			p = con.prepareStatement(query);
	
			p.setString(1,robj.getName());
			p.setString(2,robj.getEmail());
			p.setString(3,robj.getDepartment());
			p.setString(4,robj.getUsername());
			p.setString(5,robj.getPassword());
			
			int i=p.executeUpdate();
			
			if(i != 0) 
			{
				return "SUCCESS";
				
			}
		}
		catch(Exception e)
		{
			
		}
		return "SUCCESS";
}
}

