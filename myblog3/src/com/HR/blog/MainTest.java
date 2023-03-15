package com.HR.blog;

import com.HR.blog.DTO.UserDTO;
import com.HR.blog.controller.UserController;

public class MainTest {

	public static void main(String[] args) {
		// 회원 가입 합니다
		UserDTO userDTO = new UserDTO("효린", "0929", "khl4459@naver", "부산시 해운대구");
		UserController userController = new UserController();
		String result = userController.requestSignUp(userDTO, "localhost");
		System.out.println(result);

	}

}
