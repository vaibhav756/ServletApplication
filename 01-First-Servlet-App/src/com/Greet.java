package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class Greet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter writer = response.getWriter();
		writer.append("<h1>Greeting from first servlet</h1>");
	}
	
}
