class Division extends SubstractionableCalculator{
	
	public void division() {
		System.out.println(this.left/this.right);
	}
}

public class Inheritance2 {
	
	public static void main(String[] args) {
		
		Division c1 = new Division();
		c1.setOprands(10, 20);
		c1.division();
		
		//상속 또한 chain이 가능하다 위와 같이 series, parallel하게 상속이 가능
	}

}

/*상속의 장점
 *1. 부모가 만든 메소드나 필드를 이용해서 코드의 중복을 피할수 있었다 (코드의 재활용성).
 *2. 가독성의 증가, 유지보수의 편의성 등이 있다*/
