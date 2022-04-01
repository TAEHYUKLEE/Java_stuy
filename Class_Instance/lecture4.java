package Class_Instance;

class C1{
	
	static int static_variable = 1;
	int instance_variable = 2; //static이 없으니 instance variable
	
	/*여기서 용어 정리하고 가자면
	 * 인스턴스 변수 -> Non-static Field
	 * 클래스 변수 -> Static Field라고 한다. 
	 * Field란?
	 * -> 클래스 전역에서 접근 할 수 있는 변수를 의미하느데 이에 대한 것은 유효범위에서 알아본다.
	 * */
	
	static void static_static() {
		System.out.println(static_variable);
	}
	
	static void static_instance() {
		//클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
		//System.out.println(instance_variable);
	}
	
	void instance_static() {
		//인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
	}
	
}


public class lecture4 {

	/* Instance method는 Class member에 접근 할 수 있다.
	 * Class method는 Instance method에 접근 할 수 없다.
	 * */
	
	public static void main(String[] args) {
		C1 c = new C1();
		//인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		//인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.static_static();
		
		c.static_instance(); //불가능
		
		c.instance_static();
		
		c.instance_instance();
		
		C1.static_static();
		
		C1.static_instance();
		
		//C1.instance_static(); //불가능
		
		
	}
	
	
}
