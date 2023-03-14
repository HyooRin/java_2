package com.HR.blog.controller;

import com.HR.blog.DTO.UserDTO;
import com.HR.blog.service.UserService;

public class UserController {
	
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 사용자의 정보를 받아 회원가입 처리를 한다. 
	public String requestSignUp(UserDTO user, String host) {
		
		String response = "외부에서 회원가입이 안됩니다";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}		
		return response;
	}
	


}
