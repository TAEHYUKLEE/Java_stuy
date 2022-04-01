package Interface.InterfaceEx;

interface I1{
	public void x();
}

interface I2{
	public void z();
}


//하나의 클래스가 여러개의 interface를 구현할수 있다.
/*자바에서 class는 다중상속은 할수 없지만 interface는 위와같이 다중구현이 가능하다.
 *구현된 모든 interface의 method는 정의도어야 한다.*/
class A implements I1, I2{
	public void x() {}
	public void z() {}
}


/*Interface사이에 다음과 같이 상속이 가능하다*/
interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}

//그리고 상속된 interface는 상속받은 모든 method또한 구현해줘야 한다.
class B implements I4{
	public void x() {}
	public void z() {}
}


public class Multiple_Interface {
}

/*Abstract과 Interface는 비슷한듯 다르다
 *Abstract class는 일반적인 클래스와 다를게 없다. 단지 abstract method를 구현하기 위해서 (overriding 해서 각자 다양하게 구현) 
 *사용되는 class이다 즉, 구체적인 로직을 가질수 있는 메소드나 필드가 존재할수 있다.
 *하지만, Interface는 모든 필드나 메소드가 구체적인 로직을 가질수 없다. 본체가 없는 메소드들만을 가지고 있어야 한다.
 *(용도 또한 명세서 역할을 하는 것이다)*/
