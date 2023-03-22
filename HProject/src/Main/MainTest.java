package Main;

import DAO.UserDAO;
import DTO.UserDTO;
import View.LoginFrame;
import View.SaveBookFrame;
import controller.UserController;

public class MainTest {

	public static void main(String[] args) {
		
		// 코드 테스트
		//System.out.println("1111111");
		
		// 책 저장 (Library)
		SaveBookFrame bookInfo = new SaveBookFrame();
		
		
		// 코드 테스트
//		UserDTO userDTO = new UserDTO("ㅎㅎ", "5678", "050");
//		UserController controller = new UserController();
//		controller.requestSignUp(userDTO);
		
		
//		UserDAO dao = new UserDAO() ;
//		dao.checkUserByUserName(userDTO);
		
		// 회원가입 (User)
		LoginFrame login = new LoginFrame();

		
		
		

	}

}
