package com.writer;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addingservlet extends HttpServlet 
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String a= req.getParameter("number1");
		String b=req.getParameter("number2");
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int z=x+y;
		
//		PrintWriter out=res.getWriter();
//		out.println("Answer is "+z);
//		
//		req.setAttribute("zvalue", z);
//		
//		RequestDispatcher rd= req.getRequestDispatcher("squ");
//		rd.forward(req,res);
		
		
		res.sendRedirect("squ?z="+z);
		
		
	}

}
