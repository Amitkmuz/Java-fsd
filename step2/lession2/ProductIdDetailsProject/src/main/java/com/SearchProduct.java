package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchProduct
 */
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProduct() {
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
		//doGet(request, response);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Amit@123");
			System.out.println("hello");
			Statement smt= con.createStatement();
			PrintWriter out= response.getWriter();
			String s = request.getParameter("search");
			if(s.isEmpty())
			{
			out.println("Please Enter Product Id Do not  it leave blank");
			out.println("<br/><a href='homepage.html'></br>Go to Home Page!</a>");
			}
			else
			{
				String sql=" select * from productdetails  where id="+ s;
				ResultSet rs=smt.executeQuery(sql);
				if(rs.next())
				{
					out.println("Product Id is  "+rs.getInt("id")+"\n"+"     ProductName is   "+rs.getString("product_name")+"\n"+"      Price is       "+rs.getInt("price"));
				}
				else
				{
					out.println("No product is Found in this product Id   "+s+"<br/>Try Once Again");
				}
				out.println("<br/><a href='homepage.html'><br/>Go to Home Page!</a>");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("hii");
			System.out.println(e);
			
		}	
	}

}
