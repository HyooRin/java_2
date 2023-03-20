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
	
	public String requestSignUp(String userName, String password) {
		
		String response = "아이디 중복입니다. 다시 입력해주세요";
		// 확인 필요 
		if(userName.equals(userDTO.getUserName())){
			response = userService.SignUp(userDTO);
		}		
		return response;		
	}


	
	

}
