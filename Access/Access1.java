package Access;

class A{
	private int a, b;
	
	public String y() {
		return "public void y()";
	}
	
	private String z() {
		return "public void z()";
	}
	
	public String x() {
		return z();
	}
}

//여기서 public, private 등이 접근 제어자라고 한다.
/* 접근제어자는 왜 사용하게 되었는가?
 * private은 그 클래스 내부에서밖에 사용할수 없다
 * public은 밖에서 사용할수 있다.
 * 내부에서 보호해야 할 것은 private을 사용, 사용자에게 공개해야할 부분은 public으로 하면 됨
 * 장애가 발생할수도 있는 부분들을 보호하기 위해서라도 private을 설정하는거
 * */


public class Access1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//아래 코드는 오류 발생
		//System.out.println(a.z());
		System.out.println(a.x());
		

	}

}
