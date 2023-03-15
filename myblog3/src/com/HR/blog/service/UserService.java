package com.HR.blog.service;

import com.HR.blog.DTO.UserDTO;
import com.HR.blog.dao.UserDao;

public class UserService {
	
	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}	
	// 회원가입 
	public String signUp(UserDTO user) {
		
		String msg = "";
		if(user.getUserName().equals("")) {
			msg = "사용자 이름을 입력해주세요";
			System.out.println(msg);
			return msg;			
		}
		int resultRow = userDao.insert(user);
		return resultRow + "";		
	}
	
	

}
