package com.codingdojo.pets.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.pets.models.Cat;
import com.codingdojo.pets.models.Animal;
/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("catNameParam");
		String breed = request.getParameter("catBreedParam");
		int weight = Integer.parseInt(request.getParameter("catWeightParam"));
		
		Cat newCat = new Cat(name, breed, weight);
		
		String displayStr = newCat.showAffection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write(displayStr);		
		
		doGet(request, response);
	}

}
