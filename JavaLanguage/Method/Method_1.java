package Method;

public class Method_1 {
	
	public static void numbering() { //method 정의
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	
	//main method
	public static void main(String[] args) {
		numbering(); //호출
	}
	
	//우리가 많이 사용하고 있던 main이란 함수는 무엇인가? 
	/*main 메소드는 규칙이자 약속이다. 즉, 자바가 main이라고 정의되어있는 method를 실행하게 된다.
	 *우리가 실행하고자 하는 (도화지) method를 작성하고, 자바는 main 메소드를 실행하는 관계라고 보면 된다.*/
	
}
