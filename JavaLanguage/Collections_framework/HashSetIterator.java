package HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetIterator {
		
	
	public static void main(String[] args) {
		
		String[] stringArray = {"A", "B", "C", "A", "E", "C","F","H","Y","U","Q"};
		
		HashSet<String> hashSet = new HashSet<String>();	
		
		for(int i=0; i<stringArray.length; i++) {
			hashSet.add(stringArray[i]);
		}
		
		//HashSet size 출력 (Collection에 있는 method)
		System.out.println(hashSet.size());
		
		//Iterator (요소 하나씩 iteration시키면서 읽어올때 사용)
		Iterator<String> hashIt = hashSet.iterator();
		int size=0;
		while(hashIt.hasNext()) {
			System.out.print(hashIt.next());
			System.out.println(size);
			size +=1;
			
		}
		
		//순회할때 for loop사용도 가능
		for(String str: hashSet) {
			System.out.print(str + " ");
		}
		
		
		//가설 - Collection Framework의 자료구조들은 System.out.println []구조로 볼수 있다?
		System.out.println(hashSet.toString()); // HashSet도 그냥 print가 되네?
		
		//HashSet remove - 요소 제거 
		hashSet.remove("C");
		System.out.println(hashSet.toString());
		
		
		//HashSet contains (포함되어 있는지?)
		boolean yn = hashSet.contains("A");
		System.out.println(yn);
		
		
		//HashSet이 비었는지 확인 .isEmpty()
		yn = hashSet.isEmpty();
		System.out.println(yn);
		
		
		//HashSet에서 List로 받아와서 한번에 지우는것
		List<String> removeList = new ArrayList<String>(Arrays.asList("E", "F", "H")); //E, F, H를 한꺼번에 없애자
		System.out.println(hashSet);
		
	}

}
