package controller;

import DTO.LibraryDTO;
import service.LibraryService;

public class LibraryController {
	
	//private LibraryDTO librarydto;
	private LibraryService libraryService;
	
	public LibraryController() {
		libraryService = new LibraryService();
	}
	
	public String requestSaveBook(LibraryDTO libraryDTO) {
		
		String response = "아이디가 없어서 저장불가합니다. 회원가입진행해주세요";
		response = libraryService.saveBook(libraryDTO);
		
		return response;
	}

}
