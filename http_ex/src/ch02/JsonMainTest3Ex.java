package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest3Ex {

	public static void main(String[] args) {

		// 문제 1
		JsonArray jsonArray = new JsonArray();
		
		JsonObject jsonObject = new JsonObject();		
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("age", "20");
		jsonObject.addProperty("address", "부산");
		
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("name", "이순신");
		jsonObject2.addProperty("age", "33");
		jsonObject2.addProperty("address", "서울");
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("name", "세종대왕");
		jsonObject3.addProperty("age", "59");
		jsonObject3.addProperty("address", "세종시");
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject2);
		jsonArray.add(jsonObject3);
		
		System.out.println(jsonArray);
		System.out.println("=================================");
		
		
		// 문제 2		
		JsonObject jsonObject4 = new JsonObject();
		JsonObject jsonObject5 = new JsonObject();
		
		jsonObject4.addProperty("todoList", "" );
		jsonObject4.addProperty("server_name", "server_1" );
		
		jsonObject5.addProperty("id", 1);
		jsonObject5.addProperty("title", "청소");
		jsonObject5.addProperty("complete", false);
		
		JsonArray jsonArray2 = new JsonArray();
		
		jsonObject4.add( "todoList",jsonArray2);
		jsonArray2.add(jsonObject5);
		System.out.println(jsonObject4);
	}
	
	

}
