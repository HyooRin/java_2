package com.HRin.HYOBlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.HRin.HYOBlog.DTO.AlbumDTO;
import com.HRin.HYOBlog.controller.AlbumController;
import com.google.gson.Gson;

public class MainTest1 {

	public static void main(String[] args) {
		// 통신 통해서 데이터를 아래와 같이 만들어 됨

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums/1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode" + statusCode);

			if (statusCode == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				StringBuffer sb = new StringBuffer();
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				String str = sb.toString();

				Gson gson = new Gson();
				AlbumDTO albumDTO = gson.fromJson(sb.toString(), AlbumDTO.class);

				System.out.println("id :" + albumDTO.getId());
				System.out.println("title :" + albumDTO.getTitle());
				System.out.println("userId :" + albumDTO.getUserId());

				AlbumController albumController = new AlbumController();
				albumController.requestSaveAlbum(albumDTO);

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 앨범 저장
//		AlbumDTO albumDTO = new AlbumDTO(3, "도전2", 1);		
			
//		AlbumController albumController = new AlbumController();
//		albumController.requestSaveAlbum(albumDTO);

	}

}
