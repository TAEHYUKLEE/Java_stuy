package Collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi2 = A.iterator();
		//hi2 인스턴스를 만들게 된다. A라는 instance안에 1, 2, 3값은 그대로 존재하는데
		//hi2라는 집합이 생기게 되고 A의 1,2,3이 그대로 들어가게 된다 (이때 참조값으로 들어가게 된다)
		//여기서 hasNext는 hi2라는 iterator안에 값들이 존재하는지 확인하는 것이다
		//그 다음 hi2.next()가 실행이 될텐데, next호출하면 hi2안의 값중 하나를 return해주고 그 안에 참조값이 사라진다
		//이때 A에 있는 값이 사라지는게 아니다 (참조만 사라짐)
		while(hi2.hasNext()) { 
			System.out.println(hi2.next());
		}
		//Iterator는 Collection안의 모든 클래스들이 공통적으로 가지고 있는 API들이다.
		
		//ArrayList에 Collection을 써도 된다.
		//부모 data type으로 받아줄수 있다 (자식 data type은 힘들지만) -> 메모리에서 어떻게 되는거지?
		ArrayList<Integer> B = new ArrayList<Integer>();
//		Object C = B;
//		System.out.println(C);
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi3 = B.iterator();
		//hi2 인스턴스를 만들게 된다. A라는 instance안에 1, 2, 3값은 그대로 존재하는데
		//hi2라는 집합이 생기게 되고 A의 1,2,3이 그대로 들어가게 된다 (이때 참조값으로 들어가게 된다)
		//여기서 hasNext는 hi2라는 iterator안에 값들이 존재하는지 확인하는 것이다
		//그 다음 hi2.next()가 실행이 될텐데, next호출하면 hi2안의 값중 하나를 return해주고 그 안에 참조값이 사라진다
		//이때 A에 있는 값이 사라지는게 아니다 (참조만 사라짐)
		while(hi3.hasNext()) { 
			System.out.println(hi3.next());
		}
	}
}
