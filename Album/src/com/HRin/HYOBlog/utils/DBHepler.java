package com.HRin.HYOBlog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHepler {
	
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "hyoblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";
	
	private Connection conn;
	
	private DBHepler(){
		
	}
	
	private static DBHepler dbHepler;
	
	public static DBHepler getInstance() {
		if(dbHepler == null) {
			dbHepler = new DBHepler();
		}		
		return dbHepler;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			String urlFormat =  "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println(" DB 연결 완료");
			} catch (Exception e) {
				System.out.println(" DBHelper 연결 오류");
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
