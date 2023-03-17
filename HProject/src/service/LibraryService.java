package service;

import DAO.LibraryDAO;
import DTO.LibraryDTO;

public class LibraryService {
	
	private LibraryDAO librarydao;
	
	public LibraryService() {
		librarydao = new LibraryDAO();
	}
	
	public String saveBook(LibraryDTO dto) {
		int resultRow = 0;
		resultRow = librarydao.save(dto);		
		
		return resultRow + "";
	}

}
