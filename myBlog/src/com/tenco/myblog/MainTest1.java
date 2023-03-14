package com.tenco.myblog;

import com.tenco.myblog.DTO.BlogDto;
import com.tenco.myblog.controller.Blogcontroller;
import com.tenco.myblog.utils.DBHelper;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// 코드  테스트 
//		DBHelper dbHelper =  DBHelper.getInstance();
//		dbHelper.getConnection();
//		System.out.println("main에서 주소값 찍음" + dbHelper);
		
		// 코드 테스트 
		Blogcontroller blogcontroller = new Blogcontroller();
     	//BlogDto dto =  blogcontroller.requestBoardContentById(3);
		//System.out.println(dto);
		
		int result = blogcontroller.requestDeleteBoardById(3, 2);
		System.out.println(result);
		
		
	}

}
