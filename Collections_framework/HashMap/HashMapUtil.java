package HashMapProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUtil {
	
	
	public static void main(String[] args) {
		
		//참고로 HashMap이나 HashSet은 null을 허용한다.
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "A"); //hashSet은 add인데 hashMap은 put임
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		hashMap.put(5, "E");
		hashMap.put(6, "F");
		hashMap.put(7, "D");
		hashMap.put(8, "B");
		hashMap.put(9, "C");
		hashMap.put(10, "A");
		hashMap.put(3, "A"); 
		//hashmap도 key도 중복되지 않는다 -> 하지만 value는 마지막걸로 update된다.
		
		//hashMap 추가
		System.out.println(hashMap);
		
		
		//hashMap key접근해서 제거하기
		hashMap.remove(3);
		System.out.println(hashMap);
		
		
		//key로 value 접근하기
		String a = hashMap.get(5);
		System.out.println(a);
		
		
		//replace hasMap안의 key로 접근해서 원하는 value로 바꿔준다.
		String returnReplace = hashMap.replace(1, "A+");
		System.out.println(returnReplace); //기존의 value는 반환됨.
		
		
		//Map에서 keySet을 반환해온다 (Set Interface로)
		Set<Integer> keySet = hashMap.keySet();
		System.out.println(keySet);
		
		//Map안에서 values를 모두 반환한다
		Collection<String> values = hashMap.values();
		System.out.println(values);
		for(String str: values) {
			System.out.print(str);
		}
		
		
		//Entry 객체에 대해서
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		//Entry객체는 HashMap안에 key-value pair를 하나씩 받아올수 있는 객체 인터페이스
		System.out.println(entrySet);
		

		//For-loop 이용해서 조회하기
		//Set이나 List는 모두 향상된 for문으로 조회가 가능하다.
		for(Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		//Entry가 지원하는 method에는 key와 value에 대한 getter, setter가 지원된다.

		
	}
}
