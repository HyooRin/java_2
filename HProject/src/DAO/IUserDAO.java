package DAO;

import DTO.UserDTO;

public interface IUserDAO {
	
	int saveUser(UserDTO user);
	
	//  이름 중복 확인
	// checkUserByUserName
	UserDTO checkUserByUserName(UserDTO userName);
	
	
	 

}
