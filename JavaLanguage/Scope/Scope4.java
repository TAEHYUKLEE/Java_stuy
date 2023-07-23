package Scope;

class C{
	static int v1 = 20;
	int v =10; //Instance의 non-static field (Instance 변수)
	
	void m() {
		int v = 20; 
		//전역변수와 지역변수가 이름이 같다면, 지역변수 우선순위
		//으문 전역변수와 지역변수 이름은 같지만 주소는 다른것일까?
		System.out.println(v);
		
		//만약 한 번은 지역변수 v를 출력하고싶고 다른 한 번은 전역변수 v를 출력하고 싶다면?
		System.out.println(v);
		System.out.println(this.v); //Instance의 변수 Class
	}
}

public class Scope4 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}


// class Calculator2{ 
//	int left, right; //Attribute
//	
//	public void setOprands1(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//		
//		
//	public void setOprands2(int _left, int _right) {
//		left = _left;
//		right = _right;
//		//여기서 만약 지역변수의 이름과 전역변수의 이름이 같지 않다면, this를 굳이 안붙여도 알아서 전역변수
//		//임을 받아들인다. 여기서 왜 this를 붙이는지 알수 있었다.
//	}
//}


/* 교훈, 
 * 1. 전역변수, 지역변수 나눠서 좀 더 관리하기 편하도록 (같은 이름의 변수 때문에 충돌을 피할수 있도록)
 * 2. 절차지향 프로그래밍에서는 전역변수의 사용을 죄악시한다. -> 객체지향 프로그래밍이 등장한 배경?
 * 3. 전역변수가 아닌 인자를 통해서 주고 받는 것이 좋은 이유는 만약 어떤 객체 내부의 메소드가 한 인스턴스의 전역변수
 * 를 사용하고 있다면, 그 메소드는 다른 객체에서 부러와 쓰기가 힘들어질수 있다. 이전 객체의 전역변수에 의존하고 있기 
 * 때문에 따라서 인자들은 getter setter등으로 왔다 갔다 하는 것이 좋다.
 * 
 * */