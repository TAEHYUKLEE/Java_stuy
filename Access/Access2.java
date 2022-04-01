package Access;

class SameClassChecker{
	public SameClassChecker() {
		//같은 클래스
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	public void _public() {
		System.out.println("public");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
}



public class Access2 {

	public static void main(String[] args) {
		
		
	}
}
