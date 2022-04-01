package Interface.InterfaceEx;

//앞선 것과 다르게 CalculatorDummy는 Calculatable interface를 구현하고 있다
// 앞선 실수와 같이 인자를 2개준다면 interface(명세서, 약속)과 다르기때문에 아예 컴파일이 되지 않는다.
class CalculatorDummy implements Calculatable{
	public void setOprands(int first, int second, int third) {
	}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}

}
