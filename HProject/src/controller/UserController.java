package controller;

import DTO.UserDTO;
import service.UserService;

public class UserController {
	
	private UserService userService;
	private UserDTO userDTO;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 회원가입 요청 
	
	public String requestSignUp(UserDTO user) {
		
		String response = "0";

		response = userService.signUp(user);
		// 0 <-- 중복 발생 , 1 <-- 회원가입 

		// todo 0 <-- 중복, 1 <-- 등록 
		System.out.println("response :  " + response);
		return response;		
	}


	
	

}
