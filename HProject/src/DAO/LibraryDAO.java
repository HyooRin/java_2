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
	
// 추후 확인
	@Override
//	public LibraryDTO selectBookByUsernameAndPassword(String userName, String password) {
	public LibraryDTO selectBookByUsernameAndPassword() {
		
		LibraryDTO resultLibrary = null;
		
		// 전체조회 (추후 수정 여부 확인 )
		String query = " SELECT * FROM book ";
		
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, username);			
//			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				LibraryDTO dto = new LibraryDTO();
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				dto.setContent(rs.getString("content"));
				resultLibrary = dto;
			}
		} catch (SQLException e) {
			System.out.println("==== LibraryDAO 전체조회 오류 발생 ====");
			e.printStackTrace();
		}
		return resultLibrary;		
	}




		
	

}
