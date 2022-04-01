package Overloading;

public class Overloading2 {
	
	void A () {System.out.println("void A()");}
	void A (int arg1) {
		System.out.println("void A(int arg1");}
	void A (String arg1) {
		System.out.println("void A (String arg1)");
	}
	//int A () {
		//System.out.println("void A()");
	//}
	//위와 같이 void A, int A처럼 return형식이 다르다는 것으로 method를 구분하지는 못한다.
	//자바 입장에서 반환값이라는 거은 메소드를 사용하는 단계에서 알수 있는 것이 아니라, 메소드를 사용한 결과
	//이기때문에 반환값을 기준으로해서 메소드를 구분할수는 없다. 뿐만 아니라 매개변수의 이름 int para_name
	//으로도 구분하지는 못한다. 매개변수의 이름이라는 것은 메소드 내부에서 의미가 있는 것이지 호출하는 단계에서는
	//매개변수의 이름은 크게 의미가 없다.

	public static void main(String[] args) {
		Overloading2 od = new Overloading2();
		od.A();
		od.A(1);
		od.A("coding everybody");

	}

}
