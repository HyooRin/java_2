package DTO;

public class UserDTO {
	
	private String userName;
	private String password;
	private String tel;
	
	public UserDTO() {
		
	}
	
	public UserDTO(String userName, String password, String tel) {
		super();
		this.userName = userName;
		this.password = password;
		this.tel = tel;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", password=" + password + ", tel=" + tel + "]";
	}
	
	
	
	

}
