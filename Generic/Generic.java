package Generic;

class Person0<T>{
	
	public T info;
	//0. info라는 변수의 datatype을 명시적으로 지정하고 있지 않다가
	
}

public class Generic {
	//generic이란 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다.
	//인스턴스를 생성할때 확정 결정하는 것을 의미한다

	Person0<String> p1 = new Person0<String>();
	//1. 인스턴스를 생성할때 String이라는 구체적인 type을 정해준다.
	//T에 String이 들어가서 info의 data type이 String이 된다.
	//참고로 여기서는 class type자체가 Person<String>이 된다.
	
	Person0<StringBuilder>p2 = new Person0<StringBuilder>();
}
