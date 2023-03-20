package DAO;

import DTO.LibraryDTO;

public interface ILibraryDAO {
	
	int save(LibraryDTO dto);
	//LibraryDTO selectBookByUsernameAndPassword(String userName, String password);
	LibraryDTO selectBookByUsernameAndPassword();

}
