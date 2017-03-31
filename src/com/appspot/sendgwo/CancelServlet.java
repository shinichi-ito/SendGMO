package com.appspot.sendgwo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CancelServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//		String data=req.getParameter("test");
//		System.out.println(data);
//		String ShopID=req.getParameter("ShopID");
		System.out.println("Get");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/cancel.jsp");
		
		rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		System.out.println("Post");
RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/cancel.jsp");
		
		rd.forward(req, resp);
		
	}
}
