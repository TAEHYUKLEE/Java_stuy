package Interface.InterfaceEx;

//개발자 A도 다시 interface명세서에 따라 규칙을 잘 따르고 있는 것을 확인할수 있다.
class Calculator_fromA implements Calculatable{
	int first, second, third;
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum() {
		return (this.first + this.second + this.third);
	}
	
	public int avg() {
		return ((this.first + this.second + this.third)/3);
	}
}
