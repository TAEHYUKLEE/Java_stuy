package StringContatin;

public class stringContain {

	public static void main(String[] args) {
		String slaKey = null;
		String A = "/u004>/u005API0";
		String id = "API0";
		String id2 = "API1";
		
		//String.contains (내부에 특정 포함되어있는가?)
		System.out.println(A.contains(id));
		
		if (A.contains(id)) {
			slaKey = A;
			System.out.println(A);
		}
		
		//String.startsWith (특정 문자로 시작하는가?)
		System.out.println(id.startsWith("A",1));
		System.out.println(id.startsWith("A"));
		

	}

}
