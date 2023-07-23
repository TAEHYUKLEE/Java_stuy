package Collections_framework;

import java.util.ArrayList;

public class ArrayList_1 {
	
	//배열이 가지고 있는 불편한 점을 개선해주기 위해서 나온 것
	//배열을 선언할때 배열은 c와 마찬가지로 할당될 데이터 크기를 미리 정해줘야 한다.
	
	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		arrayObj[2] = "three"; //오류가 발생한다. 이미 할당된 메모리 범위를 넘어감
		for (int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//데이터의 갯수를 미리 알고 있을경우는 위와 같이 미리 할당해서 해도 괜찮겠지만, 모를경우는 상당히 불편할수 있다.
		
		//이에 따라 나온 것이 ArrayList라는 것인데 이것은 Collections Framework안에 들어가 있는 기능중 하나이다.
		//ArrayList al = new ArrayList();
		//al.add("one");
		//al.add("two");
		//al.add("three");
		//for (int i=0; i<al.size(); i++) {
			//System.out.println(al.get(i));
			////String value = al.get(i);
			//String value = (String) al.get(i);
			////arrayList의 경우 Instance의 메소드중 size를 불러와야 그 크기를 알수 있다
			////array 메소드의 length와는 차이점이 있다.
			
			/*ArrayList를 쓸때는 조금 조심해야 할 부분이 있다.
			 * 위와 같이 String value = al.get(i) 부분에서 빨간줄이 그어지는데 그 이유는
			 * ArrayList의 add라는 Method는 어떠한 데이터 타입도 수용할수 있는 method이다.
			 * 이것이 가능하기 위해서는 add라는 method의 인자(argument)가 Object type이어야 함.
			 * Object는 모든 데이터 타입의 조상이기때문이다. 이미 add를 통해서 저장하면 Object type으로 
			 * 저장되는 것이다. 따라서 Object type을 String value에 저장할려고 하기때문에 문제가 생기는 거임
			 * 따라서 형변환을 해줘야 한다. 따라서 형변환을 해줘야 한다. 하지만, 이 방식은 옛날 방식이다.
			 * 따라서 이런것을 해결하기 위해 Generic을 사용한다.*/
			
		//다음과 같이 해준다
		ArrayList<String> al = new ArrayList<String>();
			al.add("one");
			al.add("two");
			al.add("three");
			
			//위와 같이 ArrayList에 String type을 제니릭으로 주면 Object type에서 String type으로 변한다.
			for (int i=0; i<al.size(); i++) {
				System.out.println(al.get(i));
				String value = (String) al.get(i);

		}
		
	
	}
}
