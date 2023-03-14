package com.tenco.blog.dao;

public class UserDao {
	
	// 1. UserDTO를 만들어 보세요 
	public void select(int userId) {
//		public UserDTO select(int userId) {
		
		
		//USerDTO 객체를 임의의 값을 넣어서 생성하고
		//그 결과 값을 main 함수에서 출력하세요
//		UserDTO KimUser = new UserDTO();
//		return KimUser;
		
		// DB 에 있는 부분을 연동하고 싶다면
		// 거기에 맞는 기술들을 알아보고 분석해서 준비하면 된다. 
		
		// MySQL <-- 데이터 관리 (다중 접속 가능 )
		// 드라이버 
		
		// Connection 객체가 필요하다. 
		// 주소, 계정,  비번, 데이터 베이스 이름 , 포트번호 , 사용할 문자셋, 현지시간 
		// Connection 이라는 객체안에 담겨져있다. 
		
		// Connection 이라는 객체 연결처리와 또 많이하는 작업은 
		// SQL을 만들고 실행하는 일이다.
		// SQL 질의어를 만들기 위해서는 Statement 객체가 필요하다.
		
		// connection 객체에서 Statement, PrepareStatement를 생성할 수 있다.
		// connection.createStatemen() OR 
		// connection.prepareStatement 를 사용할 수 있다. 
		// ?의 값을 바인딩하는 기능 
		
		// prepareStatement 질의어를 생성하고 질의어를 실행시킬 수 있다. 
	   // select <- excuteQuery() 사용하면 된다.
		// delete, update, insert <- executeUpdate() 사용하면 된다.
		
		// 쿼리를 실행하면 결과값은 
		// executeUpdate() --> 적용받은 row의 객수를 반환한다. 
		
	}

}
