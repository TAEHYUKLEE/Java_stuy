package Generic;

class EmployeeInfo1{
	//필드 변수
	public int rank;
	
	//생성자
	EmployeeInfo1(int rank){
		this.rank = rank;
	}
}

class Person<T,S>{
	//필드 변수
	public T info;
	public S id;
	
	//생성자
	Person(T info, S id){
		this.info = info;
	}
	
	//메소드
	//4강 추가 generic은 method level에서 사용 가능하다 꼭 class level에서만 사용되는건 아니다.
	//접근제한자, <generic> 메소드 이름 (인자) class는 클래스 명 다음 generic을 썼는데 
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class Generic3 {
	public static void main(String[] args) {
		
		//Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1),1);
		
		//T에는 EmployeeInfo datatype이 들어가고, S에는 int가 들어갈 것이다. 
		//그런데, int라고 쓰면 error가 발생하는데 왜 error가 발생하는지 알아볼 것이다.
		//Generic에서의 datatype은 바로 참조형만 들어갈수 있기 때문에 기본 원시 데이터 타입은 들어갈수가 없다. 
		//그러면 원시 데이터 타입은 사용할수 없는 것인가? ㄴㄴ
		//wrapper class라는 것을 사용하면 된다. 기본 데이터타입은 객체가 아니라서 이런 원시데이터 타입을 마치 객체인것처럼
		//만들수 있는 객체들을 제공한다. 이런 Class들을 wrapper class라 한다. 
		EmployeeInfo e = new EmployeeInfo(1);
		Integer id = new Integer(1);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, id);
		//int -> Integer, double -> Double 등 
		//그리고 생성자에 들어가는 인자들도 객체화 시켜줘야 한다.
		//위와 같이 id인스턴스를 만들어서 보내주게 된다.
		System.out.println(p1.id.intValue());
		//intValue -> 참조형을 원시형 int로 바꿔주는 method이다. (wrapper class의 method)
		
		
		//제네릭 4강 추가 
		//생략 가능
		Person p2 = new Person(e, id);
		//참조가 이미 EmployeeInfo datatype, Integer datatype이므로 자바가 알아서 유추가 가능하다 (생략 가능)
		
		p1.printInfo(e);
		//메소드는 메소드 명 이전에 클래스는 클래스 명 다음에 제네릭<>을 만들어 놓네 
		//위에서는 알아서 유추 가능하므로 생략해 놓은것 원래는 p1.<EmployeeInfo>printInfo(e);로 해야함
		
	}

}
