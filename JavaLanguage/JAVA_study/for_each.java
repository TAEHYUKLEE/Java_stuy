package JAVA_study;

public class for_each {

	public static void main(String[] args) {
		
		String [] members = {"이", "태", "혁"};
		//int numArr[10] C언어랑 약간 형태가 다르다.
		
		for(String e : members) { 
			//변수 e를 선언한 이후 members에 있는 elements를 e에 담아 반복해 준다. 향상된 for문
			System.out.println(e + "님");
		}

	}

}
