package com.HRin.HYOBlog.DTO;

public class AlbumDTO {
	
	private int id;
	private String title;
	private int userId;
	
	// 지정 해놓으면 Gson이 인식 못해서 오류 뜸  
//	public AlbumDTO(int id, String title, int userId) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.userId = userId;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AlbumDTO [id=" + id + ", title=" + title + ", userId=" + userId + "]";
	}
	
	
	
	
	
	

}
