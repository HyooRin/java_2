package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest2 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/10");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// http 요청을 -> 2가지 방식 (GET, POST)
			conn.setRequestMethod("GET");
			conn.connect(); // (브라우저 에서 주소 입력후 )Enter 누르는 것과 같음 
			int statusCode = conn.getResponseCode();
			//System.out.println("statusCode" + statusCode );
			// 200 : 통신, 404 : 요청 URL 없다.
			if(statusCode == 200) {
				// conn
				// 기반 스트림 + 보조 스트림 : 데코레이션 패턴
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				StringBuffer sb = new StringBuffer();
				while( (line = reader.readLine()) != null  ) {
					sb.append(line);
					
					
				}
				String str = sb.toString();
				//System.out.println(sb.toString());
				//JSON Parsing 해보기 -> 문자열 -> Java Object 변환
				
				Gson gson = new Gson();
				Todo todo = gson.fromJson(sb.toString(), Todo.class);
				System.out.println("id :" + todo.getId());
				System.out.println("userId :" + todo.getUserId());
				System.out.println("title :" + todo.getTitle());
				System.out.println("completed :" + todo.isCompleted());
				
				
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
