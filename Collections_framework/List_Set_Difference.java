package Collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class List_Set_Difference {
	
	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		
		//HasSet은 위에서 2를 4번 추가했지만, 1번밖에 안나왔다. 
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		System.out.println("");
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(2);
		B.add(2);
		B.add(2);
		B.add(2);
		B.add(3);
		//ArrayList는 위에서 2를 4번 추가한 것이 모두 반영되었다. 
		Iterator hi2 = (Iterator) B.iterator();
		while(hi2.hasNext()) {
			System.out.println(hi2.next());
		}			
		
		/*결과적으로 List와 Set의 큰 차이점은 중복이 되느냐 중복이 되지 않느냐에 포인트를 둘수 있다
		 * List - 입력한 모든 값들이 저장되는 형식을 가지고 있는 컨테이너들이다
		 * Set - 입력한 값들이 고유한 값들만 저장되는 것들이 Set이라는 카테고리에 있는 컨테이너들이다. */
	}

}
