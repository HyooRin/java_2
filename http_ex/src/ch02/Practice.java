package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Practice {

	public static void main(String[] args) {
		
		JsonObject jsonObject = new JsonObject();
		JsonArray jsonArray = new JsonArray();
		
		JsonObject jsonObject2 = new JsonObject();
		
		jsonObject.addProperty("allContent", "");
		
		jsonObject2.addProperty("seq", 3);
		jsonObject2.addProperty("title", "");
		jsonObject2.addProperty("description", "");
		jsonObject2.addProperty("file_Url", "contents/169891290236");
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("seq", 2);
		jsonObject3.addProperty("title", "Vivaldi Winter");
		jsonObject3.addProperty("file_Url", "contents/1669890341");
		jsonObject3.addProperty("userid", "incopost");
		
		
		jsonObject.add("allContent", jsonArray);
		jsonArray.add(jsonObject2);
		jsonArray.add(jsonObject3);
		
		
		System.out.println(jsonObject);

	}

}
