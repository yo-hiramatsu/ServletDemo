package com.example.demo2.service;

import com.example.demo2.form.UserForm;

public class UserService {
	public void registerUser(UserForm userForm){
		// 本当はここでデータを登録する
		System.out.println("以下のユーザーを登録しました");
		System.out.printf("name=%s%n", userForm.getName());
		System.out.printf("Email=%s%n", userForm.getEmail());
		System.out.printf("password=%s%n", userForm.getPassword());
	}
}
