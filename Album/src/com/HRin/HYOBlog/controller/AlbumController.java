package com.HRin.HYOBlog.controller;

import com.HRin.HYOBlog.DAO.AlbumDAO;
import com.HRin.HYOBlog.DTO.AlbumDTO;
import com.HRin.HYOBlog.service.AlbumService;

public class AlbumController {
	
	private AlbumDTO albumDTO;
	private AlbumService albumService;
	
	
	public AlbumController() {
		albumService = new AlbumService();
	}
	
	public String requestSaveAlbum(AlbumDTO dto) {
		
		String response = "아이디가 없어서 저장불가";
		
		 response = albumService.savealbum(dto);
		
		
		return response;
	}

}
