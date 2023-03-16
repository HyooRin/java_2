package com.HRin.HYOBlog.service;

import com.HRin.HYOBlog.DAO.AlbumDAO;
import com.HRin.HYOBlog.DTO.AlbumDTO;

public class AlbumService {
	
	private AlbumDAO albumDAO;
	
	public AlbumService() {
		albumDAO = new AlbumDAO();
	}
	
	public String savealbum(AlbumDTO dto) {
		
		int resultRow = 0;
		resultRow = albumDAO.insert(dto) ;	
		
		return resultRow + "";
	}

}
