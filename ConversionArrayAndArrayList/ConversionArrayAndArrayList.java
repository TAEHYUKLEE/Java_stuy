package Conversion;

import java.util.ArrayList;
import java.util.List;

public class ConversionArrayAndArrayList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(2);
		intList.add(3);

		//size만큼 지정하고 for문돌리면서 넣기
		Integer[] intgerArray = new Integer[intList.size()];
		
		for(int i=0; i<intList.size(); i++) {
			intgerArray[i] = intList.get(i);
			System.out.println(intgerArray[i]);
		}
		
		//ArrayList.toArray 메소드 사용하기 (toArray(들어갈 array형식과 사이즈가 들어가야 한다))
		Integer[] intArray = intList.toArray(new Integer[intList.size()]);
		
		for(Integer integer: intArray) System.out.println(integer);
		
		//Wrapper Class Array to Primitive Class Array
		int[] intarrayHo =  new int[intList.size()]; // new로 Heap영역에 메모리를 올릴때는 항상 array size정해줘야 한다
		int size=0;
		for(Integer integer: intArray) {
			//intarrayHo[size] = (int) integer;
			intarrayHo[size] = integer.intValue();
			size++;
		}
		
		for(int in: intarrayHo)	System.out.println(in);

	}

}
