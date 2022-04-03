package Generic;

abstract class Info{
	public abstract int getLevel();
}

class EmployeeInfo2 extends Info{
	//필드 변수
	public int rank;
	
	//생성자
	EmployeeInfo2(int rank){
		this.rank =rank;
	}

	//메소드
	@Override
	public int getLevel() {
		return 0;
	}
}

//여기서 T extends Info를 왜 쓰느냐? 
/* 앞서 말한것처럼 제네릭을 쓰게 되면 개나 소나 데이터 타입을 넣을수 있게 된다. 안정성에 문제가 될수 있기 때문에
 *내가 원하는 데이터 타입만을 주기 위해서 데이터 타입을 내가 정한 것만 제한하는 것이다. 아래 예시에서
 *T extends Info로 해주면, Info의 자식들만을 제네릭을 넣어줄수 있다.*/

class Person2<T extends Info>{
	//Generic안에서의 extends는 상속한다라는 의미가 아니라 부모가 누구다라는 의미를 갖는다
	/*참고로 위에서 추상클래스가 아닌 interface Info{int getLevel();}을 사용하고
	 * class EmployeeInfo2 implements Info{}를 사용해도 된다. 이때 
	 * Generic 안에도 implements로 바꿔야하는거 아니냐 라고 할텐데 상속의 의미가 아니기때문에 extends로 써야한다
	 * 명심하도록*/
	
	public T info;
	Person2(T info){
		this.info = info;
		info.getLevel(); //위의 generic에서 extends Info안해주면 사실상 이 method는 모르는 method가 된다.
	}
}

public class Generic4 {
	
	public static void main(String[] args) {
		Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
		//Person<String> p2 = new Person<String>("부장"); // 이건 거부한다.
	}

}
