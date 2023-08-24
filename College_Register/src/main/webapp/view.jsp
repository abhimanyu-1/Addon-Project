<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*"%>
<table>
<tr>
<th>Select</th>
<th>NAME</th>
<th>EMAIL</th>
<th>Department</th>
<th>User name</th>
</tr>
<%
try
{
	Class.forName("com.mysql.jdbc.Driver");
	String query="select * from student";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	
	while(rs.next())
	{
		String id=rs.getString("id");
		String name=rs.getString("name");
		String email=rs.getString("email");
		String department=rs.getString("department");
        
		
		%>
		<tr>
		
		<td><%=name %></td>
		<td><%=name %></td>
		<td><%=email %></td>
		<td><%=department %></td>
		

		</tr>
	
		<%
	}
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</table>	
</body>
</body>
</html>