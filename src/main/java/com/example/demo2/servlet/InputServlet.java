package com.example.demo2.servlet;

import java.io.*;

import com.example.demo2.form.UserForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class InputServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UserForm userForm = new UserForm();
		userForm.setName("");
		userForm.setEmail("");
		userForm.setPassword("");
		request.setAttribute("userForm", userForm);
		request.getRequestDispatcher("/input.jsp").forward(request, response);
	}

}
