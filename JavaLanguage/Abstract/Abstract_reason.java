package Abstract;
//Abstract 상속을 강제하는 것

abstract class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

//받는쪽에서 abstract method 로직 만들어줘야한다.
class Calculatorplus extends Calculator {
	
	public Calculatorplus(int a, int b) {
		this.left = a; super.left = a;
		this.right = b; super.right = b;
		//this를 써도 상관없고 super를 써도 상관은 없네;;
		//근데 웬만하면 구별해주는 것이 좋다.
	}

	public void sum() {
		System.out.println("+sum:" + (this.left + this.right));
	}
	public void avg() {
		System.out.println("+avg:" + (this.left + this.right)/2);
	}
	public void ho() {
		System.out.println(this.left);
		System.out.println(super.right);
		//불러오는데 super나 this 어떤걸 사용해도 크게 상관이 없다. 
		//하지만 생성자에서는 꼬이기 쉽기때문에 확실히 구분해서 초기화해주는 것이 좋다.
	}
	
}

class Calculatorminus extends Calculator {
	public void sum() {
		
	}
	public void avg() {
		
	}
}

public class Abstract_reason {
	/*상황에 따라 달라지는 부분이 있는데 이런 부분들을 모두 포괄하는 케이스를 짤수 없기 때문에
	 * 사용자가 짤수 있게 해주는 것이 바로 abstract의 취지이다*/
	public static void main(String[] args) {
		Calculatorplus c1 = new Calculatorplus(3,6);
		//c1.setOprands(20,30);
		c1.run();
		c1.ho();
	}

}
