package Main;

import DTO.UserDTO;
import View.SaveBookInfo;
import controller.UserController;

public class MainTest {

	public static void main(String[] args) {
		
		// 코드 테스트
		//System.out.println("1111111");
		SaveBookInfo bookInfo = new SaveBookInfo();
		
		
		// 회원가입 코드 테스트
		UserDTO userDTO = new UserDTO("김효린", "1234", "010-2265-8611");
		UserController controller = new UserController();
		String result = controller.requestSignUp("김효린", "1234");
		System.out.println(result);
		
		
		

	}

}
