package Collections_framework;

import java.util.HashMap;

public class Map1 {
	//Map은 key와 value로 되어있다. 
	//Key값은 중복될수 없지만 value값은 중복될수 있다.
	
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		//여태까지 List, Set은 value하나만 있었는데 HashMap은 key와 Value가 존재하므로 2개의 제네릭이 필요한 것이다.
		a.put("one",1); //put은 Map에만 존재하는 메소드이다. 
		a.put("two",2);
		a.put("three",3);
		a.put("four",4);
		System.out.println(a.get("one")); //원하는 값을 가져올때는 key값을 get에 인자로 전달하면 그 value가 나온다.
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		//key로 value에 접근하기때문에 key가 중복되면 안되는 것이었다.

	}
}
