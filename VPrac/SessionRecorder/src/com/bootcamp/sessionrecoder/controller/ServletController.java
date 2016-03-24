package com.bootcamp.sessionrecoder.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/register")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out = res.getWriter();
		HttpSession hs = req.getSession();
		Connection con =null;
	String sesNum = req.getParameter("session");
	if(sesNum.equals("1")){
		String firstName = req.getParameter("fname");
		String middleName = req.getParameter("mname");
		String lastName = req.getParameter("lname");
		String fatherName = req.getParameter("faname");
		String motherName = req.getParameter("moname");
		hs.setAttribute("fname", firstName);
		hs.setAttribute("mname", middleName);
		hs.setAttribute("lname", lastName);
		hs.setAttribute("faname", fatherName);
		hs.setAttribute("moname", motherName);
		res.sendRedirect("./form.html");
		
	}
	if(sesNum.equals("2")){
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String zipcode = req.getParameter("zip");
		String country = req.getParameter("country");
		hs.setAttribute("dob", dob);
		hs.setAttribute("address", address);
		hs.setAttribute("city", city);
		hs.setAttribute("state", state);
		hs.setAttribute("zip", zipcode);
		hs.setAttribute("country", country);
		res.sendRedirect("./form2.html");
	}
	if(sesNum.equals("3")){
		String qual = req.getParameter("qual");
		String sname = req.getParameter("sname");
		String cname = req.getParameter("cname");
		String contact = req.getParameter("contact");
		String firstName = (String) hs.getAttribute("fname");
		String middleName = (String) hs.getAttribute("mname");
		String lastName = (String) hs.getAttribute("lname");
		String fatherName = (String) hs.getAttribute("faname");
		String motherName = (String) hs.getAttribute("moname");
		String dob = (String) hs.getAttribute("dob");
		String address = (String) hs.getAttribute("address");
		String city = (String) hs.getAttribute("city");
		String state = (String) hs.getAttribute("state");
		String zipcode = (String) hs.getAttribute("zip");
		String country = (String) hs.getAttribute("country");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregistartion","root","654321");
			PreparedStatement ps =con.prepareStatement("insert into ses values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, middleName);
			ps.setString(4, fatherName);
			ps.setString(5, motherName);
			ps.setString(6, dob);
			ps.setString(7, address);
			ps.setString(8, city);
			ps.setString(9, state);
			ps.setString(10, zipcode);
			ps.setString(11, country);
			ps.setString(12, qual);
			ps.setString(13, sname);
			ps.setString(14, cname);
			ps.setString(15, contact);
			int i = ps.executeUpdate();
			if (i!=0) {
				out.println("Succefully registered");
			}else{
				out.println("Register failed");
			}
		}catch(Exception e){
			out.println("Register failed");
			e.printStackTrace();
		}
		finally {
			try{con.close();
			System.out.println("connection closed succefully");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("connection didnt close");
			}
			}
		}
	}
	}


