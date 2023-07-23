package Class_Instance;

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

public class lecture2 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		//Calculator의 객체를 새로 만들고 c1이라는 변수에 담았다
		//c1이라는 변수의 데이터형은, Calculator라는 객체를 담을수 있는 데이터 형식이어야 한다.
		//c1 앞의 Calculator는 데이터 타입임. 즉, 이것은 데이터 타입을 직접 만드는 것이다.
		
		/*여기서 정혹히 말로 표현해주네, 객체를 만든다는 것은 사용자 정의 데이터 타입을 우리가 만든다
		 *라는 것이라는 의미를 시스템 내부적으로 갖게된다. 
		 
		 *그러니까 Calculator 데이터 타입의 정체가 궁금했었는데, 그 안에 소속되어 있는 attribute 등의
		 *메모리 할당되어야 할 부분들 있잖아? 앞서 int c에서 하는 것과같이 메모리에서 미리 공간을 확보해 놔야하니까
		 *Calculator안에서 필요한 변수들의 묶음들을 한번에 데이터타입으로서 정의 또는 선언한거지*/
		
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		
		//c1, c2는 동일한 클래스로 만들어진 인스턴스이기때문에, 동작하는 방법은 정확하게 동일하다
		//하지만, 두 개의 객체들은 가지고 있는 변수가 다르다. 데이터가 다르다 다른말로는 상태가 다르다고 한다
		//같은 행위를 하더라도 상태가 달라서 그 결과가 달라질수 있다.
	}

}
