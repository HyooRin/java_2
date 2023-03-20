package service;

import DAO.UserDAO;
import DTO.UserDTO;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	// 회원가입 
	public String SignUp(UserDTO user) {
		
		String msg = "";
		// 아이디 중복확인 -> 추후에 추가		
		if(user.getUserName().equals("")){
			msg = "사용자이름을 입력해주세요";
			return msg;			
		}
		int resultRow = userDAO.saveUser(user);		
		return resultRow + "";
	}
	
	

}
