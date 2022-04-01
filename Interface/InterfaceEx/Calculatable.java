package Interface.InterfaceEx;

public interface Calculatable {
	public void setOprands(int first, int second, int third);
	public int sum(); 
	public int avg();

	/*미스 커뮤니케이션을 겪은 이후에 개발자 A와 B는 서로 합의 하에 인터페이스를 만들게 된 것이다.
	 *Calculate class는 위와 같이 setOprands는 3개의 인자를 받아야하고 sum과 avg두개의 메소드를 갖는다 라는 약속이다.
	 *그리고 sum과 avg는 int를 반환한다.*/
	
	/*참고 
	 * class가 구현하는 interface에 의해 외부에서 제어하기 위한 조작 장치이다 (format에 맞춰 규제하기 위한것)
	 * 이에 따라 외부에서 제공하는 것이기때문에 interface의 메소드는 무조건 public으로 해줘야 한다. (아니면 컴파일 안됨)*/
}
