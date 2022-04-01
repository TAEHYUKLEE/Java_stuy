package Overriding;

class Calculator{ //설계도
	int left, right; //Attribute
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//this는 self와 같다 (그 instance, 객체의 attribute를 의미한다.)
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() { //void
		System.out.println((this.left+this.right)/2);
		return ((this.left+this.right)/2);
	}
	
}

class SubstractionableCalculator extends Calculator {
	
	public void sum() {
		System.out.println("실행결과는"+ (this.left + this.right)+"입니다.");
	}
	/*Point1*/
	//이렇게 자식 Class에서 부모 Class가 가지고 있는 같은 이름의 method를 정의했을때 과연
	//부모 Class의 method가 실행될 것인가 자식 Class의 method가 실행될 것인가?
	//결론적으로는 부모 Class가 가지고 있는 method는 무시가되고 자식 Class가 가지고 있는 method가 실행이 된다.
	//이것을 method overriding이라 한다. (자식 method가 우선순위이기 때문이다)
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
	//public int avg() {
		//return ((this.left + this.right)/2);
	
		/*Point3 - 기능을 아예 새로 재정의 할때*/
		//부모의 return type은 void인데, 자식은 int이다 이러면 오류가 뜬다. 
		//즉 overriding을 위해서는 부모와 똑같은 매개변수 형식, return type, 메소드 이름을 갖어야한다.
		//여기서 메소드의 이름, 메소 매개변수의 숫자, 타입, 순서, 메소드의 리턴 타입 -> 메소드의 형태를 정의하는 사항들을
		//통틀어서 메소드의 서명 (signature)라고 한다.
	//}
	
	/*Point4 - 기존의 기능을 유지하면서 새로운 기능을 추가하고 싶을때*/
	//만약 변수와 마찬가지로 부모 Class의 메소드를 가지고 오고 싶다면?
	//아래와 같이 Super를 쓰면 된다. 그런데 위에서 void로 avg를 선언했을때는
	// return 형식이 Object로 되네 -> 이 포인트들도 알아두자.
	public int avg() {
		//특정 기능을 그대로 가져다 쓰면서 하위 기능을 더 추가하고 싶을때
		return super.avg();
		//이렇게 호출하고 뒤에다가 다른 기능들을 덧 붙일수 있다.
	}
	
}

public class Overriding1 {
	
	/*Point2*/
	//앞선 강의에서 상속에서는, 부모가 가지고 있는 메소드는 그대로 물려받고 그 외의 메소드에 대해서
	//추가하여 쓴다라는 방식을 추구했다
	/*이번에 살펴볼 Overriding은 부모한테 물려받은 method를 필요에 따라 자식이 재 정의해서 기능을
	 * 변경하는 방법에 대해서 알아보자는 것*/
	
	public static void main(String[] args) {
		
		SubstractionableCalculator s1 = new SubstractionableCalculator();
		
		s1.setOprands(20, 40);
		s1.sum();
	}



}
