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
		}	
		
		return resultRow;
	}

}
