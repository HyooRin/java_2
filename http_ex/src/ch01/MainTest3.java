package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest3 {

	public static void main(String[] args) {
		
		// URL
		// ..I/O
		// POST <-- 단 ch01 패키지에서 만들어주세요 
		// 값을 담았다면 콘솔창에 출력까지 연습
		
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/19");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode" + statusCode);
			
			if(statusCode == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				StringBuffer sb = new StringBuffer();
				while( (line = reader.readLine()) != null ) {
					sb.append(line);
				}
				String str = sb.toString();
				
				Gson gson = new Gson();
				Todo todo = gson.fromJson(sb.toString(), Todo.class);
				System.out.println("id :" + todo.getId());
				System.out.println("userId :" + todo.getUserId());
				System.out.println("title :" + todo.getTitle());
				System.out.println("completed :" + todo.isCompleted());			
				
			
				
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
