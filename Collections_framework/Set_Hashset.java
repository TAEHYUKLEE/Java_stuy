package Collections_framework;

import java.util.HashSet;

public class Set_Hashset {
	
	public static void main(String[] args) {
		//수학의 Set과 같은 개념이다 집합 중복이 되지 않는다는 면에서 일맥상통한다.
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(1);
		B.add(2);
		B.add(3);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); //false
		//A안에 B요소들이 전체가 들어있느냐를 의미하는 것 -> containsAll문법 (부분집합이느냐? - subset)
		
		System.out.println(A.containsAll(C)); //true

		//A.addAll(B); //A에다 B전체를 합친다 (합집합 시킨다.)
		//A.retainAll(B); //retain 간직한다. A와 B모두 있는 값만 A에 남기겠다. (교집합)
		//A.removeAll(B); //A집합에 있는 값중 B집합에 있는 값을 모두 빼겠다 (차집합)
		
		//Set은 순서가 보장되어 있지 않다. 
		/*List와 Set은 크게 중복과 순서 차이가 크게 있다.*/
	}

}
