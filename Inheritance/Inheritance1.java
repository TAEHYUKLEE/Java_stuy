package Inheritance;

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
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class Inheritance1 {
	
	//상속이란 것은 특정 객체가 가지고 있는 field나 method를 다른 객체에서도 실행가능하게 말 그대로 상속
	//시키는 것을 의미한다. 아니! 그러면 그냥 Class열어서 기능 추가하면 되지 왜 상속하느냐?
	//그 클래스를 내가 만들지 않았다면? 상속이 당연히 필요한 것이다.
	
	/*삭속의 목표
	 * 기존의 객체를 그대로 유지하면서 어떤 기능을 추가하는 방법이 없을까? 이런 맥락에서 등장한 것이 상속
	 * 기존의 객체 - 기능을 물려준다 해서 부모 객체
	 * 새로운 객체 - 기존의 객체의 기능을 물려받는다해서 자식 객체가 된다.
	 * 
	 * 여기서 부모 클래스와 자식 클래스의 관계를 상위(super,base) 클래스, 하위(sub, derived)클래스라 표현하기도 한다.*/
	
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
