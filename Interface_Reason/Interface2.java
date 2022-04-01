package Interface_Reason;

/* Point 1 - 가정
 * 계산기가 엄청나게 거대한 프로젝트라고 가정해보자 이에 따라 개발자 A, 개발자 B가 분담해서
 * 각 클래스의 로직을 만들고 있다고 해보자.
 * 이때 개발자 B는 개발자 A가 계산기를 잘 만들어서 나중에 제출할 것이라 기대하고 자기 나름대로
 * 개발을 진행하고 있다. 그리고 개발자 B는 아래와 같이 코드를 짰다*/

/* Point 2 - Dummy class가 필요한 이유
 * CalculatorDummy는 개발자 A가 이렇게 짤것이다라고 하여 가짜 클래스를 만들어 놓은 것이다*/
class CalculatorDummy{
	public void setOprands(int first, int second, int third) {
	}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}


public class Interface2 {
	public static void main(String[] args) {
		
		/*Point 3 - (B개발자가 A개발자의 class의 사용자 입장이므로- B개발자도 개발을 독립적으로 해야하므로)
		 * 아래와 같이 개발자 A class가 개발되었다고 가정한 이후 부분을 B개발자가 개발을 해야하므로
		 * 위와 같은 Dummy class가 필요한 것이다.*/
		CalculatorDummy c = new CalculatorDummy();
		//모조 클래스는 A개발자가 3개월이든 몇개월 이후에 잘 만들어져서 자신한테 인계될 것이라고 기대하고 있다.
		//따라서 A개발자가 개발한 class를 대충 위와같이 만들어놓고 자기 자신의 로직을 아래에 만드는 것이다.
		//(각 개발자가 독립적으로 개발을 시작하여 시간을 saving하기 위함이다)
		
		c.setOprands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
		
		/* 그런데 문제가 생겼다 Calculator라는 class를 A 개발자가 만들어서 왔는데 B개발자는 3개의 값을 인자로 주고 있는데
		 * A개발자는 2개의 값을 인자로 주고 있다. 당연히 오류가 날 것이고 서로 접목이 되지 않을 것이다. 
		 * 이것은 일종의 미스커뮤니케이션에 의한 실패라고 볼수 있다. 이렇게 미스커뮤니케이션을 대면으로 이루는 것 보다 코드 레벨에서
		 * 이룰수 있다면 더 확실하고 안정적일것이다. -> 이것이 interface이다.*/
	}

}
