package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class InsertFlight
 */
public class InsertFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFlight() {
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
		PrintWriter pw;    
        response.setContentType("text/html");    
        pw=response.getWriter();    
            
            
        String name=request.getParameter("name");    
        String fromf=request.getParameter("fromf");    
        String tof=request.getParameter("tof");    
        String datef=request.getParameter("datef");    
        String timef=request.getParameter("timef");    
        String price=request.getParameter("price");    
        //float price=Float.parseFloat(price);    
            
            
        try    
        {    
        	Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","Amit@123");
			System.out.println("connection established with database");  
                
                
            String query="Insert into flights(name,fromf,tof,datef,timef,price) values (?,?,?,?,?,?);";    
            PreparedStatement pstmt=con.prepareStatement(query);    
            pstmt.setString(1, name);    
            pstmt.setString(2, fromf);    
            pstmt.setString(3,tof);    
            pstmt.setString(4, datef);    
            pstmt.setString(5, timef);    
            pstmt.setString(6,price);    
                
            int x=pstmt.executeUpdate();    
                
            if(x==1)    
            {    
            pw.println("Values Inserted Successfully");    
            }    
                
        }    
        catch(Exception e)    
        {    
                e.printStackTrace();    
        }
        
            
           
        pw.close();    
	}

}
