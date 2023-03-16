package com.HRin.HYOBlog.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.HRin.HYOBlog.DTO.AlbumDTO;
import com.HRin.HYOBlog.utils.DBHepler;

public class AlbumDAO implements IAlbumDAO{
	
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public AlbumDAO() {
		conn = DBHepler.getInstance().getConnection();
	}
	

	@Override
	public int insert(AlbumDTO dto) {
		
		String query = " INSERT INTO album (id, title, userId) "
				+ " VALUES(?, ?, ?) ";
		
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getId() );
			pstmt.setString(2, dto.getTitle());
			pstmt.setInt(3, dto.getUserId());
			resultRow = pstmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("insert  오류 발생");
			e.printStackTrace();
		}
		return resultRow;
		
	}

}
