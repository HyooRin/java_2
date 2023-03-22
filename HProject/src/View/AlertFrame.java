package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlertFrame extends JFrame{
	
	JPanel panel;
	
	JLabel alert;
	
	JButton button;
	
	public AlertFrame() {
		
		initData();
		setInitLayout();
		addEventListener();		
	}
	
	public void initData() {
		
		setTitle("alert");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();		
		alert = new JLabel("이미 존재하는 이름입니다");
		button = new JButton("확인");
		
	}
	
	public void setInitLayout() {
		
		setResizable(false);
		setVisible(true);
		panel.setLayout(null);
		
		add(panel);
		panel.add(alert);
		panel.add(button);
		
		alert.setSize(200,50); 
		alert.setFont(new Font("맑은고딕",Font.BOLD,15));
		alert.setLocation(50, 50);
		
		button.setSize(100, 30);
		button.setLocation(90, 150);
		
	}
	public void addEventListener() {
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);				
			}
		});
		
	}
	
//	public static void main(String[] args) {
//		new AlertFrame();
//		
//	}
	


}
