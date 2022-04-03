package Collections_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		System.out.println("HashMap format" + a);
		//hasformat은 순서가 없기때문에 indexing이 불가능하다.
		//{} <- Python의 dictionary와 같네. Key=value로 되어 있다. 다만 Python은 key:value로 되어있다.
			
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);

	}

	static void iteratorUsingIterator(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		//Map아래 Entry라는 interface또는 class가 있다고 생각하면 편할 것 같다. 
		//map에서.entrySet()을 이용하면 Set으로 변한다 []로 되어있다. 그리고 변환된 것을
		//Set<datatype> entries <- map.entrySet();로 넣어준다.
		
		
		//Python에서는 for k, v in spiral_inx.items():로 dictionary안의 값을 뽑아옴.
		System.out.println("Set format" + entries);
		for (Map.Entry<String, Integer> entry : entries) {
			//entries안에 있는 요소들을 하나 하나 향상된 for문으로 출력해준다.
			//for문으로 어떻게 빼는거지?
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

	static void iteratorUsingForEach(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
	}
}
