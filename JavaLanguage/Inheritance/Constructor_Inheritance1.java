class Cal{ //설계도
	int _left, _right; //Field
	int result;
	
	public Cal() {} //기본 생성자
	//상속할때 기본 생성자를 부르기로 약속되어 있어서 parameter생성자가 있다면 만들어줘야한다.
	
	public Cal(int _left, int _right) {
		this._left = _left;
		this._right = _right;
	}
	
	public void sum() {
		System.out.println(this._left + this._right);
	}
	
	public void avg() {
		System.out.println((this._left+this._right)/2);
	}
	
}

class Substraction extends Cal {
	
	//field for substraction
	int sub_left, sub_right;

	//부모 클래스를 상속할때는 부모 클래스를 자동으로 호출하도록 약속되어 있다. 
	//하지만 위에서 Cal는 명시적으로 생성자를 만들어 놓았다.
	//상속받을때는 기본 생성자를 호출해야하는데 명시적으로 위와같이 매개변수를 갖는 생성자가 있을때는 
	//기본 생성자가 자동으로 추가되지 않는다.

	public Substraction(int _left, int _right) {
		//super(_left, _right);
		super._left = _left; //super는 this와 마찬가지로 부모를 가리킨다
		super._right = _right;
		//만약 자식 Class에서 부모 Class 변수를 초기화하고싶다면 위와같이 super라는 부모 Class를
		//가리키고 그 하위에 있는 변수를 꺼내주면 된다.
		
		//자식 Class의 초기화는 위와같이 부모 변수가 초기화된 이후 자식 변수가 초기화되어야한다.
		this.sub_left = _left;
		this.sub_right= _right;
		
	}
	
	public void substract() {
		System.out.println(this._left - this._right);
		System.out.println(super._left); 
		/*
		 * 하위 클래스에서 상위 클래스에 있는 변수를 가져오면 중복이다
		 * this.left = left;
		 * this.right = right;
		 * -> 만약 부모 (상위)클래스 변수를 가져다 쓰고 싶다면?
		 * (super를 쓰면 된다)
		 * */
	}
}

public class Constructor_Inheritance1 {
	
	//생성자
	public Constructor_Inheritance1() {
		
	}
	
	public static void main(String[] args) {
		Constructor_Inheritance1 c = new Constructor_Inheritance1();
		//작 자신의 객체를 생성할수도 있다.
		
		Substraction sub1 = new Substraction(20, 30);
		sub1.substract();
	}

}
