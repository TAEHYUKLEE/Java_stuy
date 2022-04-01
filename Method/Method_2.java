package Method;

public class Method_2 {
	
	public static String numbering(int init, int limit) {
		// String -> numbering이라는 method가 return한 값이 String이어야 한다. (데이터 형식)
		// 한 마디로 return할 변수의 데이터 형식
		int i = init;
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output = "";
		while(i<limit) {
			//숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output += i;
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		//메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		//void는 return이 없다.
		String result = numbering(1,5);
		//변수 result의 값을 화면에 출력한다.
		System.out.println(result);
	}
}