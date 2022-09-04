package CompareObject;

import java.util.*;
import java.io.*;
import java.math.*;

public class ComparableUsage {

	public static void main(String[] args) {
		
		Student a = new Student(18, 3);
		Student b = new Student(19, 5);
		
		int bigOne = a.compareTo(b);
		
		if(bigOne>0) System.out.println("a가 b보다 나이가 많다");
		else if(bigOne==0)  System.out.println("a와 b의 나이는 같다");
		else System.out.println("a가 b보다 나이가 적다");
		
	}
	
}


class Student implements Comparable<Student>{
	
	//Comarable은 Interface라 했다.
	
	private int age;
	private int classNumber;
	
	public Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.age - o.age;
	}
	
	
}
