package StackUse;

import java.util.*;
import java.util.stream.*;
import java.util.Map.*;

public class StackUse {
	
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(10);
		stack.push(7);
		
		System.out.println(stack);
		
		//stack pop method (최상단 제거 후 반환)
		int a = stack.pop();
		System.out.println(a);
		
		//stack 가장 맨 위에 있는거 조회하기 (제거는 x)
		int b = stack.peek();
		System.out.println(b);
		
		
		//전체 조회
		System.out.println(stack);
		
		//or stack size와 stack get()
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		
		//포함되어 있는지
		boolean containYn = stack.contains(5);
		System.out.println(containYn);
		
		//비어있는지 확인하기
		boolean emptyYn = stack.isEmpty();
		System.out.println(emptyYn);
		
		//전체 다 클리어하기
		stack.clear();
		
		
		//비어있는지 확인하기
		emptyYn = stack.isEmpty();
		System.out.println(emptyYn);
	
		
	}
}
