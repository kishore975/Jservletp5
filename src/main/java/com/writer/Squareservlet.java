package com.writer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squareservlet extends HttpServlet 
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
//	int B1=(int)req.getAttribute("zvalue");
//	int B2=B1*B1;
	
	int B1= Integer.parseInt(req.getParameter("z"));
	int B2=B1*B1;
	
//	PrintWriter out=res.getWriter();
//	out.println("Square of "+B1+" is "+B2);
	
	PrintWriter out=res.getWriter();
	out.println(B2+" is Square of "+B1);
		
	}

}
