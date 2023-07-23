package BoxingUnboxing;

public class BoxingUnboxing {
	

	
	public static void main(String[] args) {
		
		int primitive = 30;
		//Integer wrapper = new Integer(primitive); // 삭제됨
		
		//Boxing
		Integer wrapper = (Integer) primitive; // WrapperClass로 감싸는 것을 Boxing이라 한다
		System.out.println(wrapper.toString());

		
		//Unboxing
		int unbox = wrapper.intValue(); //intValue
		System.out.println(unbox);
		
		//또는 Casting을 해줘도 된다
		int unbox2 = (int) wrapper;
		System.out.println(unbox2);
		
		
		//Double형도 마찬가지겠지?
		double primitiveDouble = 30;
		Double doubleWrapper = (Double) primitiveDouble;
		System.out.println(doubleWrapper);
		
		double unbox3 = doubleWrapper.doubleValue();
		System.out.println(unbox3);
		
		double unbox4 = (double) doubleWrapper;
		System.out.println(unbox4);
		
		
	}

}
