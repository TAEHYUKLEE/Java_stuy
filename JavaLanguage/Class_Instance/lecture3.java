package Class_Instance;

class Calculator3{ 
	//앞서 설명한 필드에 있는 변수만이 static속성을 가질수 있는것은 아니다
	//함수 또한 static으로 선언해서 Instance가 아닌 Class소유의 메소드가 될수 있다.
	
	//Class소속의 method가 됨 static을 이용해서 (Class에 직접 접근해서 쓸수 있다)
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
	
}

public class lecture3 {
	
	public static void main(String[] args) {
		
		//Calculator3 c1 = new Calculator3();
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(10, 20);
		//왜 static을 이용해서 Class에 직접 접근해서 method, variable을 가지고 오느냐?
		//각각의 Instance는 서로 다른 속성을 가져야할 필요가 있을때 사용이 된다.
		//하지만, Class의 공통의 속성, 메소드가 필요할때가 존재한다. 즉, 메모리를 더 많이 사용할 필요가 
		//없고 하나의 메모레로서 모든 Instance에서 공통으로 사용할수 있게 하거나 하기 위함이다.

		//Calculator3 c2 = new Calculator3();
		
	}

}
