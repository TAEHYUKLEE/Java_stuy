package Scope;

public class Scope3 {
	
	static int i =5; //전역변수로 i=5를 했을때
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		//int i = 30;
		System.out.println(i);
		
		/*여기서 얘기하고자 하는 것은 a유효범위 안에 int i=10이 있고 b를 호출했으니까
		 * b method안에서의 i또한 a method에서 선언한 i를 공유하지 않을까 하는 것이다.
		 * 하지만, 그렇지 않다 b는 b영역에서 선언된 변수만을 취급하거나 전역변수를 취급하게 된다.
		 * 이런 것을 정적인 유효범위라고 한다 (static, lexical scope)
		 * 만약 a에서 선언된 int i=10;을 가져와서 b에서 출력한다면 이것을 동적인 유효범위 (dynamic scope)이라 한다
		 * 자바는 static scope를 default로 한다. 
		 * 하지만, 근대에 만들어진 프로그래밍 언어 파이썬 등은 동적인 스타일을 추구한다
		 * */
	}
	

	public static void main(String[] args) {
		
//		for (int i =0; i<5; i++) {
//			System.out.println(i);
//		}
		
		//System.out.println(i);
		//위의 for문 i는 for문 안에서만 유효하기때문에 밖에서는 i를 모른다.
		
		
		//두 번째 
		int i = 1;
		a();
		
		
	}
	
}

