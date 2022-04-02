package Generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

//class StudentPerson{
//	public StudentInfo info;
//	StudentPerson(StudentInfo info){
//		this.info = info;
//	}
//}


class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

//class EmployeePerson{
//	public EmployeeInfo info;
//	EmployeePerson(EmployeeInfo info){
//		this.info = info;
//	}
//}

//우선적으로 위의 EmployeePerson, StudentPerson 등과 같이 중복되는 것을 막기 위해서
//아래와 같이 하나의 Person class로 만들었다. 근데 서로 데이터 타입이 class type이 다름
//이에 따라 공통 조상 class (Object)를 주기로 했다.
class Person{
	public Object info;
	
	//생성자
	Person(Object info){
		this.info = info;
	}
}

public class Generic2 {
	
	public static void main(String[] args) {
		//원래는 EmployeeInfo, StudentInfo Instance가 오기를 기대하고 있었지만, 착각해서 "부장"이라고 입력했다고 해보자
		//이럴때 심지어 문법상 오류가 없고 컴파일까지 되었다.
		Person p1 = new Person("부장");
		EmployeeInfo ei = (EmployeeInfo)p1.info; //p1에서 나오는 type은 Object type이라 형변환 해줘야함.
		//실행해보면 ClassCastException이 뜨는걸 알수 있다. -> runtime할때 error가 발생되긴 한다. 
		System.out.println(ei.rank);
		//이렇게 강제적으로 바꾸는 것은 type이 안전하지 않다고 한다.
		
		//위의 Person에서 Object를 씀으로써 우리가 원치 않은 어떠한 데이터 타입도 허용해버리고 타입이 안전하지 않게 되어버렸다.
		//이런 문제들을 해결하기 위해 즉, Person하나로 중복을 제거했지만, 그 전의 Datatype이 달라서 Object class로 만들어
		//타입이 안전하지 않게 만들어버리는 문제를 해결하기 위해 Generic이라는게 도입된 것이다. (안전성, 중복제거)
	}

}
