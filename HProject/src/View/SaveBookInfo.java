package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import DTO.LibraryDTO;
import controller.LibraryController;

public class SaveBookInfo extends JFrame {
	
	JPanel panel;
	JLabel title;
	JLabel author;
	JLabel content;
	
	JTextArea titleText;
	JTextArea authorText;
	JTextArea contentText;
	
	JButton savebutton;
	JButton cancelbutton;
	LibraryController libraryController;
	
	public SaveBookInfo() {
		initData();
		setInitLayout();
		addEventListener();
		
	}	
	
	public void initData() {
		
		setTitle("책저장");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		panel = new JPanel();
		title = new JLabel("title :");
		author = new JLabel("author :");
		content = new JLabel("content :");
		titleText = new JTextArea();
		authorText = new JTextArea();
		contentText = new JTextArea();
		
		savebutton = new JButton("SAVE");
		cancelbutton = new JButton("CANCEL");
		
		libraryController = new LibraryController();
		
		// 이벤트 리스너 만들어 주세요 
		// 데이터가 필요해 !!! 
		
//		String result = libraryController.requestSaveBook();
//		System.out.println("result : " + result);
	}
	public void setInitLayout() {
		
		setResizable(false);
		setVisible(true);
		panel.setLayout(null);
		
		add(panel);
		panel.add(savebutton);		
		panel.add(cancelbutton);		
		panel.add(title);
		panel.add(author);
		panel.add(content);
		panel.add(titleText);
		panel.add(authorText);
		panel.add(contentText);
		
		
		// 글자
		title.setSize(100, 80);
		title.setFont(new Font("맑은고딕",Font.BOLD , 15));
		title.setLocation(30,0);
		titleText.setSize(350, 20);
		titleText.setLocation(80,30);
		
		author.setSize(100,100);
		author.setFont(new Font("맑은고딕",Font.BOLD , 15));
		author.setLocation(20,30);
		authorText.setSize(350, 20);
		authorText.setLocation(80,70);
		
		content.setSize(100,100);
		content.setFont(new Font("맑은고딕",Font.BOLD , 15));
		content.setLocation(30,60);
		contentText.setSize(420, 250);
		contentText.setLocation(30,130);		
		
		// 버튼 
		savebutton.setSize(80, 30);
		savebutton.setLocation(130, 400);		
		cancelbutton.setSize(80, 30);
		cancelbutton.setLocation(280, 400);	
		
	}
	
	public void addEventListener() {
		savebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("111");
				//System.out.println(titleText.getText());
				LibraryDTO dto = new LibraryDTO(titleText.getText(),authorText.getText() ,
						contentText.getText());
				libraryController.requestSaveBook(dto);
			}
		});
		
		cancelbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
	



}
