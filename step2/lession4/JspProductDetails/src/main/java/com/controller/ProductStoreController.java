package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
//import com.service.ProductService;


/**
 * Servlet implementation class ProductStoreController
 */
public class ProductStoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStoreController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<String> errors = new ArrayList<>();

		String productName = request.getParameter("productName");
		String productCategory = request.getParameter("productCategory");
		String productPrice = request.getParameter("productPrice");

		if (productName.length() == 0) {
		errors.add("Product name cannot be empty");
		}
		if (productCategory.length() == 0) {
		errors.add("Product category cannot be empty");
		}
		if (productPrice.length() == 0) {
		errors.add("Product Price cannot be empty");
		} else {
		try {
		Double.parseDouble(request.getParameter("productPrice"));
		} catch (NumberFormatException e) {
		errors.add("Product Price invalid");

		}
		}

		HttpSession session = request.getSession();

		if (errors.isEmpty()) {
		Product p = new Product(productName, Double.parseDouble(productPrice), productCategory);
		session.setAttribute("Name", p.getProductName());
		session.setAttribute("Price", p.getProductPrice());
		session.setAttribute("Category", p.getProductCat());
		response.sendRedirect("finalPage.jsp");

		} else {
		session.setAttribute("errors", errors);
		response.sendRedirect("index.jsp");
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
			
	}

}
