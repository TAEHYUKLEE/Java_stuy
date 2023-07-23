package ArraysMethod;

import java.util.Arrays;

public class CopyOf {

	private static int[] array1 = {0,1,2,3,4,5};
	private static int[][] array2 = {};
	
	
	public static void main(String[] args) {
		
		//copyof - "배열 전체"를 복사해서 새로운 배열 생성 & 반환
		/*(인수로 "끝 범위" 지정 가능: 지정된 범위의 '끝'은 포함하지 않는다)
		* < <
		*/
		int[] arr2 = Arrays.copyOf(array1, array1.length);
		/* array1전체가 복사돼서 arr2에 저장된다.
		 Arrays.copyOf(array1, array1.length); -> Heap영역에 새로 생성
		 int[] arr2 -> stack영역에 주소를 반환해서 저장.*/
		
		/* 출력: toString() 
		 * array출력할려면 원래는 for-loop돌렸잖아?
		 * 그럴필요 없이 이 또한 Arrays.toString() 지원한다
		 */
		//1차원 array 출력
		System.out.println(Arrays.toString(arr2)); 
		
		//array1의 0~2까지 복사해서 넣어준다
		int[] arr3 = Arrays.copyOf(array1, 3);
		System.out.println(Arrays.toString(arr3)); 
		
		//기존 배열보다 끝 범위가 더 길다 -> 넘어서는 부분은0으로 채운다
		int[] arr4 = Arrays.copyOf(array1, 10);
		System.out.println(Arrays.toString(arr4)); 
		
		//copyofRange() - "배열의 일부" 복사해서 새로운 배열 생성 & 반환
		int[] arr5 = Arrays.copyOfRange(array1, 2, 4);
		System.out.println(Arrays.toString(arr5)); //[2,3,4]
		
		int[] arr6 = Arrays.copyOfRange(array1, 0, 10);
		System.out.println(Arrays.toString(arr6)); //[2,3,4]
		
		
		
	}
}
