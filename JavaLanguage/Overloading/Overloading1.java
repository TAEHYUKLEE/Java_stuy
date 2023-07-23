package Overloading;

class Calculator{ //설계도
	int left, right, third; //Attribute
	
	public void setOprands(int left, int right) {
		System.out.println("setOprands 2 parameters");
		this.left = left;
		this.right = right;
		//this는 self와 같다 (그 instance, 객체의 attribute를 의미한다.)
	}
	
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands 3 parameters");
		//this.left = left;
		//this.right = right;
		//위의 this.left, this.right은 중복이 된다.
		
		this.setOprands(left,  right);
		/*Point 4 - Overloading에서 중복을 제거하기 위한 방법*/
		//중복 선언한 것을 막기 위해서 this.setOprands를 통해서 위와 같이 한다.
		//자기 자신의 setting함수(이전의 변수를 넣을수 있는)를 불러서 설정하게된다.
		
		this.third = third;
		/*Point 3 - Overloading의 방법및 핵심 개념*/
		//위의 steOprands와 메소드 이름이 같은데? 어떻게 구분하지?
		//-> 자바에서는 매개변수의 숫자나 type이 다르다면 다른 메소드로 인식한다. 
		//이것이 바로 method overloading에 대한 개념이다.
		//사용자로부터 이름을 구분할 필요가 없어진다 Overloading의 핵심이다.
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public int avg() { //void
		System.out.println((this.left+this.right+this.third)/2);
		return ((this.left+this.right+this.third)/2);
	}
	
}

public class Overloading1 {
	/*
	 * Point 0 - Overloading이란?
	 * Overloading이란?
	 * Class에 method를 정의할때 같은 이름이지만, 서로 다른 매개변수의 형식을 가지고 있는 메소드를
	 * 여러개를 정의할수 있는 방법이다.*/

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		System.out.println(c1.third); //초기화를 해주지 않았는데 0이 들어가 있네
		
		/*Point 1 - Overloading의 당위성 예시*/
		//현재 이 계산기의 한계는 두 개의 값에 대해서만 계산이 가능하다는 점이다.
		//아래처럼 같은 method이름에 다른 인자들을 받아올수 있게 하는 것 method overloading이다
		//위에 첨가시켜놓음
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();

		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();

	}

}
