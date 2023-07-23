package Reference;

//4강에서 추가
class ReferenceParameterDemo{
	static void _value(int b) {
		//매개변수에서 일어나는 일은 int b = a;라고 되는 것과 같다.
		//이건 기본 데이터 타입이기때문에 복제가 일어난다.
		b = 2;
	}
	
	static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue," + a);
	}
	
	static void _reference1(A b) {
		//여기서는 A b = a;가 된다 즉, 참조값이 전달된다.
		b.id = 2;
	}
	
	static void runReference1() {
		A a = new A (1);
		_reference1(a);
		//위에서 바뀐 b는 a 인스턴스와 같은 곳을 가리키고 있기때문에
		//아래의 결과는 2가 나온다.
		System.out.println("runReference1," +a.id);
	}
}

//2강에서 추가
class A{
	public int id;
	
	A(int id){ //생성자임
		this.id = id;
	}
}


public class Reference1 {
	
	//1강
	public static void runValue() {
		int a = 1;
		int b = a;
		
		/*a변수 (상자)에 1을 넣고 
		 *a상자 안에 있는 1을 복제해서 b상자에 넣는 과정이다*/
		b = 2;
		/*b상자 안의 숫자를 2로 바꿔도 a상자 안의 값이 바뀌지 않는다.*/
		
		System.out.println("runValue, " + a);
	}
	
	//2강에 추가
	public static void runReference() {
		A a = new A(1);
		A c = new A(2);
		
		//c = a;
		System.out.println("programming");
		System.out.println(a);
		System.out.println(c);
		
		A b = a; //A class변수타입인 b를 정의함 
		b.id = 2; 
		
		//3강에서 추가
		b = new A(2); //여기서부터 a,b는 각자 다른 instance를 가리키게 된다.
		
		System.out.println("runReference, " + a.id);
		//분명 a.id는 생성할때 1을 넣었는데, 2가 나온다 왜 그런것일까?
		// A b = a;는 원시데이터 타입과 다르게 참조값을 b에게 주는 것이다.
		
	}
	

	public static void main(String[] args) {
		
		/* 1강에서 원시데이터 vs 참조형 데이터 타입
		 * Primitive data type - 원시형 데이터 타입
		 * 총 8개를 알아보았다. byte, short, int, long, char, double, float, boolean 이 존재했다
		 * 기본 데이터 타입이 있다는 것은 기본 데이터 타입이 아닌 것이 존재할 것이다.
		 * new를 통해서 생성하는 것들은 참조형 데이터 타입이라고 한다. (참조형, 참조자료형)
		 * */
		
		runValue();
		runReference();
	}
}
