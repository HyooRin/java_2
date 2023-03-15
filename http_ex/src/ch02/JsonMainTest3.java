package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest3 {

	public static void main(String[] args) {
		
		JsonArray jsonArray = new JsonArray() ;
		// [] <-- 여기까지 만들어줌 
		// jsonObject
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "티모");
		
		System.out.println(jsonArray);
		System.out.println("=============");
		System.out.println(jsonObject);
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		
		System.out.println("-------------");
		System.out.println(jsonArray);
		
		System.out.println("=======연습==========");		
		JsonArray jsonArray2 = new JsonArray();
		JsonObject jsonObject2 = new JsonObject();
		JsonObject jsonObject3 = new JsonObject();
		
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("id", 1);
		jsonObject2.addProperty("title", "delectus aut");
		jsonObject2.addProperty("completed", false);
		
		jsonObject3.addProperty("userId", 2);
		jsonObject3.addProperty("id", 2);
		jsonObject3.addProperty("title", "delectus aut nam anme");
		jsonObject3.addProperty("completed", false);
		
		jsonArray2.add(jsonObject2);
		jsonArray2.add(jsonObject3);		
		System.out.println(jsonObject2);
		System.out.println(jsonArray2);		
		System.out.println("-------------");
		
		// JsonArray 에서 JsonObject 꺼내는 방법
		JsonObject targetObject = jsonArray.get(2).getAsJsonObject();
		System.out.println(targetObject);
		String strName = targetObject.get("name").getAsString();
		System.out.println(strName);
		
		

	}

}
