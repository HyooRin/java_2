package Album2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO implements IDAO {

	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public DAO() {
		conn = DBHepler.getInstance().getConnection();
	}
	
	
	@Override
	public int insert(DTO[] dto) {
		
		String query = " INSERT INTO album (id, title, userId) "
				+ " VALUES(?, ?, ?) ";
		
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);		
			
			ArrayList<DTO> arr = new ArrayList<>();
			
			for(int i =0; i< arr.size(); i++) {
			//pstmt.setInt(1, arr.get(0) );
//			pstmt.setString(1, dto.getid());
//			pstmt.setString(2, dto.getTitle());
//			pstmt.setInt(3, dto.getUserId());				
			}			
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 오류 발생");
			e.printStackTrace();
		}
		
		return resultRow;
	}

}
