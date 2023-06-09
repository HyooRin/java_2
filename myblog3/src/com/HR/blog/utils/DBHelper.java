package com.HR.blog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	// 1. Connection 객체를 얻는 연습
	// 주소, 계정, 비번 ,등등 ....
	
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "hyoblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";
	
	private Connection conn;
	
	// 싱글톤 패턴
	// 1. 기본 생성자 private
	private DBHelper() {
		
	}
	// 2. 자기자신 private
	private static DBHelper dbHelper;
	
	// 3.  접근가능 static 메서드
	public static DBHelper getInstance() {
		if(dbHelper == null) {
			dbHelper = new DBHelper();			
		}
		return dbHelper;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			String urlFormat =  "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println("-- DB연결완료 --");
			} catch (Exception e) {
				System.out.println("-- DBHelper에서 오류 발생 --");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}
	
	
	
	

}
