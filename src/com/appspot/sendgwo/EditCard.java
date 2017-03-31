package com.appspot.sendgwo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditCard extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//		String data=req.getParameter("test");
//		System.out.println(data);
//		String ShopID=req.getParameter("ShopID");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/editcard.jsp");
		
		rd.forward(req, resp);
	}
	
	
	
	
}
