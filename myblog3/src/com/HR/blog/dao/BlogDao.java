package com.HR.blog.dao;

public class BlogDao {
	
	public String select(String msg) {
		
		String copyMsg = " [[ >> " + msg + " << ]]";		
		return copyMsg;
	}

}
