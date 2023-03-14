package com.HR.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.HR.blog.DTO.UserDTO;
import com.HR.blog.utils.DBHelper;

public class UserDao implements IUserDao{	
	
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;
	
	public UserDao() {
		conn = DBHelper.getInstance().getConnection();
	}

	@Override
	public int insert(UserDTO user) {
		
		String query = " INSERT INTO user(username, password, email, address) "
				+ " VALUES( ? , ? , ? , ? ) ";
		
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("saveUser 에서 오류발생");
			e.printStackTrace();
		}		
		return resultRow;
	}

	@Override
	public UserDTO select(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
