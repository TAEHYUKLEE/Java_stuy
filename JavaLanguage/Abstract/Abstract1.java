package Abstract;

abstract class A{
	
	/*Point 1 - 추상 클래스 안의 추상 메소드*/
	/*추상 클래스는 사용하기 위해서 반드시 상속받을 클래스를 만들어서 클래스를 사용해야 한다*/
	public abstract int b();
	/* b라는 메소드는 추상메소드이다. 이 추상 메소드의 특징은 메소드들이 담고 있는 구체적인
	 *메소드는 정의되어 있지 않다. 추상적인 모습만이 남아있는 메소드
	 *즉, 추상 클래스를 상속한 클래스에서 이 추상 메소드의 구체적인 로직을 정해줘야만 한다.
	 *(참고로 추상 메소드를 사용하기 위해서는 추상 클래스를 사용해야만 한다.)*/
	
	/*Point 2 - 추상 메소드는 로직을 갖고있을수 없다.*/
	//아래와 같이 추상메소드인데 중괄호 로직을 가지고 있으면 안된다.
	//public abstract int c() {System.out.println("Hello");}
	
	
	/*Point 3 - 본체가 있는 메소드도 가질수 있다.*/
	/*추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.*/
	public void d() {
		System.out.println("world");
	}
	
}

class B extends A {
	//위의 추상 클래스 안의 추상메소드를 overriding해줌으로써 정해줘야한다
	public int b() {
		return 1;
	}
	
}

public class Abstract1 {
	
	public static void main(String[] args) {
		//A obj = new A();
		
		//추상 클래스를 상속받은 B class객체를 만들자
		B obj = new B();
	}

}
