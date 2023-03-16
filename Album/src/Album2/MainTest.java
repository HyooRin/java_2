package Album2;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		ArrayList<User> arrList = new ArrayList<>();
		arrList.add(new User("김효린"));
		arrList.add(new User("손주이"));
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
	}
}
class User{
	private String name;
	public User(String name) {
		this.name = name;
	}	
	
	@Override
	public String toString() {
		return name;
	}
}


