package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import DTO.UserDTO;
import controller.UserController;

public class LoginFrame extends JFrame {
	
	JPanel panel;
	
	JLabel name;
	JLabel password;
	
	JButton logInbutton;
	JButton signUpbutton;
	
	JTextArea nametxt;
	JTextArea pwdtxt;
	JTextArea teltxt;
	
	UserController controller = new UserController();

	
	public LoginFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		
		setTitle("login");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		name = new JLabel();
		password = new JLabel();
		
		logInbutton = new JButton("로그인");
		signUpbutton = new JButton("회원가입");
		
		nametxt = new JTextArea();
		pwdtxt = new JTextArea();
		teltxt = new JTextArea();
	}
	
	public void setInitLayout() {
		
		setResizable(false);
		setVisible(true);
		panel.setLayout(null);
		
		add(panel);
		panel.add(logInbutton);
		panel.add(signUpbutton);
		panel.add(nametxt);
		panel.add(pwdtxt);
		panel.add(teltxt);
		
		// text 
		nametxt.setSize(350,20);
		nametxt.setLocation(100, 100);
		pwdtxt.setSize(350,20);
		pwdtxt.setLocation(100, 200);
		teltxt.setSize(350,20);
		teltxt.setLocation(100, 300);
		
		// 버튼 
		logInbutton.setSize(100,50);
		logInbutton.setLocation(100,350);
		signUpbutton.setSize(100, 50);
		signUpbutton.setLocation(300,350);
		
		
		
	}
	
	public void addEventListener() {
		logInbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		// 회원가입 
		signUpbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UserDTO userDTO = new UserDTO(nametxt.getText(), pwdtxt.getText(), teltxt.getText());
				String response = controller.requestSignUp(userDTO);
				
				if(response .equals("0")) {
					new AlertFrame();
				}			
								
			}
		});
		
	}
	

	
}
