package com.example.demo2.servlet;

import com.example.demo2.form.UserForm;
import com.example.demo2.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SubmitServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 入力情報の取得
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// 登録完了画面に渡す値をセット
		UserForm userForm = new UserForm();
		userForm.setName(name);
		userForm.setEmail(email);
		userForm.setPassword(password);
		request.setAttribute("userForm", userForm);

		// ユーザーを登録
		UserService service = new UserService();
		service.registerUser(userForm);

		// 登録完了画面に遷移
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
}
