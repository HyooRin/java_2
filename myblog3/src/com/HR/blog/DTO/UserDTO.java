package com.HR.blog.DTO;

public class UserDTO {
	
	private String userName;
	private String password;
	private String email;
	private String address;
	private String createDate;
	
	public UserDTO() {
		
	}

	public UserDTO(String userName, String password, String email, String address) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", createDate=" + createDate + "]";
	}	
	
	
	
	
	
	
	

}
