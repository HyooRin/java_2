package com.tenco.myblog.controller;

import com.tenco.myblog.DTO.BlogDto;
import com.tenco.myblog.Service.BlogService;

public class Blogcontroller {
	
	private BlogService blogService;
	
	public Blogcontroller() {
		blogService = new BlogService();
	}
	
	// 외부에서 오는 요청을 담당하는 녀석
	public BlogDto requestBoardContentById(int id) {
		
	 	BlogDto responseDto = blogService.selectByBoardId(id);
	 	return responseDto;
		
	}
	
	// 하나의 게시글 삭제하기
	public int requestDeleteBoardById(int boardId, int userId) {
		
		int responseRow = blogService.deleteBoardById(boardId, userId);
		return responseRow;		
	}
	

}
