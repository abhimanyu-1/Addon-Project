package com.controller.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.model.Register;
import com.dao.model.CollegeDao;

/**
 * Servlet implementation class CollegeController
 */
@WebServlet("/CollegeController")
public class CollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String action = request.getParameter("action");
		System.out.println(action);
		
	
		if(action.equals("reg")) 
		{
			Register robj = new Register();
			robj.setName(request.getParameter("name"));
			robj.setEmail(request.getParameter("email"));
			robj.setDepartment(request.getParameter("dept"));
			robj.setUsername(request.getParameter("username"));
			robj.setPassword(request.getParameter("password"));
			
			CollegeDao dobj = new CollegeDao();
			String value = dobj.regEmployee(robj);
			
			if(value.equals("SUCCESS"))
			{
				request.getRequestDispatcher("view.jsp").forward(request, response);
			}
			
		}
	}

}
