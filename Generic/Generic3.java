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
	public T info;
	public S id;
	Person(T info){
		this.info = info;
	}
}

public class Generic3 {
	public static void main(String[] args) {
		Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1),1);
	}

}
