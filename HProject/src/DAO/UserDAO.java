package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.UserDTO;
import utils.DBHelper;

public class UserDAO implements IUserDAO {
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int saveUser(UserDTO user) {
		
		int resultRow = 0;
		
		String query = " INSERT INTO user(userName, password, tel) "
				+ " VALUES( ?, ? , ? ) ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getTel());
			
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("== signUp 함수 오류발생 ==");
			e.printStackTrace();
			resultRow = 0;
		}	
		
		return resultRow;
	}

	// 아이디 중복확인 
	@Override
	public UserDTO checkUserByUserName(UserDTO userName) {
		
		UserDTO userdto = null;
		
		String query = " SELECT userName "
				+ " FROM user "
				+ " WHERE userName = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userName.getUserName());			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				userdto = new UserDTO();
				userdto.setUserName(rs.getString("userName"));				
			}
		} catch (SQLException e) {
			System.out.println("UserDAO 중복이름찾기 오류발생");
			e.printStackTrace();
		}		
		return userdto;				
	}

}
