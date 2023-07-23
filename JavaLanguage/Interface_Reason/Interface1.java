package Interface_Reason;

//인터페이스의 역할 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 
//그 객체는 반드시 인터페이스의 메소드들을 구현해야 한다.



interface I{
	public void z();
}


/*Interface의 특징은 어떤 class가 있고 그 class가 특정한 Interface를 사용한다면 
 * 그 class는 반드시 Interface가 포함하고 있는 메소드들을 구현해야한다.
 * 만약 Interface에서 강제하고 있는 메소드를 구현하지 않으면 컴파일 조차 되지 않는다.*/


class A implements I{
	
	//Class A는 interface I를 구현한다.
	public void z() {
		
	}
}




public class Interface1 {
	
	
}