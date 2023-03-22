package service;

import DAO.UserDAO;
import DTO.UserDTO;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	// 회원가입 
	public String signUp(UserDTO user) {
		
		int resultRow = 0;
		//String msg = "";
		
		// 이름 중복확인 		
//		if( user.getUserName().equals()){
//			msg = "중복";
//			return msg;			
//		}
		
	    UserDTO checkUser  =	userDAO.checkUserByUserName(user);
	    if(checkUser == null) {
	    	resultRow = userDAO.saveUser(user);
	    } 
				
		return resultRow + "";
	}
	
	

}
