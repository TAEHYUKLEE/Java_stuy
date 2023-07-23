package Final;

class A{
	
	final int b() {
		return 1;
	}
}

final class C{

}

class B extends A {
	
	//int b() {
		//Final 때문에 method overriding을 할수가 없다.
	//}
}

//class D extends C{
//	//C class가 final이기때문에 더 이상 바뀌지 못한다 상속이 안됨.
//}


public class final1 {
	
	static final double PI = 3.14;
	//여기서 Final까지 다뤄보자 
	//Final은 더 이상 바뀌지 않는 constant를 의미한다 더 이상 수정이 안됨. (더 이상 변경되지 않음)
	//Javascript에서 const와 같다. let과는 반대되는 개념.

	public static void main(String[] args) {


	}

}
