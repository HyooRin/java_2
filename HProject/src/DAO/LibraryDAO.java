package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.LibraryDTO;
import utils.DBHelper;

public class LibraryDAO implements ILibraryDAO {
	
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public LibraryDAO() {
		conn = DBHelper.getInstance().getConnection();
	}	

	@Override
	public int save(LibraryDTO dto) {
		
		String query = " INSERT INTO book(title, author, content) "
				+ " VALUES( ? , ? , ?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getContent());
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("save 오류 발생");
			e.printStackTrace();
		}		
		
		return resultRow;
	}

}
