package Scope;

class Calculator{ //설계도
	int left, right; //Field
	
	//생성자 - (객체 생성역할이자 초기화 담당)
	public Calculator(int left, int right) { 
		//Calculator 생성자라 하고 constructor라한다.
		//Calculator 객체가 생성이 될때 
		this.left = left;
		this.right = right;
	}
	
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

public class Constructor_Initialization {
	
	//앞선 Calculator에서는 setOperands method를 가지고 Instance의 Field값을 초기화 시켰다.
	//하지만, 사용자 입장에서는 setOprerands라는 method가 있는지도 알기 힘들고 초기화도 하기 힘들다.
	/*이에 따라서 처음에 객체를 생성할때 각 인자들을 초기화 시킬수 있으면 좋지 않을까? 이래서 생성자가 나옴
	 *즉, 필드의 Instance변수들을 초기화시켜주기 위한 방법이자 객체를 생성시켜주기 위한 방법으로 생성자가 나옴*/

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		//Class를 실행할때 Class이름과 똑같은 이름의 메소드가 실행되도록 약속되어 있다. 
		//Class를 생성할때 생성자가 없으면 자동으로 만들어준다. 이에 따라 오른쪽 항에 있는 Calculator는
		//Class가 아니라 생성자 method를 불러오는 것이다. (Class 객체를 생성해주는 생성자)
	}
}
