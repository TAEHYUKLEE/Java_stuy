package Class_Instance;

class Calculator2{ 
	//Instance의 변수가 아닌 Class소유의 변수가 존재할수 있다
	static double PI = 3.14; //Instance의 변수가 아닌 Class가 갖는 것.
	static int base = 0;
	//static한 변수란? --> Class에 소속된다는 것이다. 모든 Instance에서 공통으로 쓸수 있다.
	int left, right; //Attribute
	
	//클래스 멤버는 크게 변수와 메소드가 되는데, 변수에서는 (필드와 생성자로 나눌수 있다)
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left+this.right + base)/2);
	}
	
}

public class lecture1 {
	
	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		
		c1.setOprands(10, 20);
		System.out.println(c1.PI);
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.PI);
		
		//만약 클래스 변수 base의 값을 10으로 지정했다.
		Calculator2.base = 10;
		
		c1.sum();
		c2.sum();
		
	}

}
