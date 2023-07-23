package CompareObject;

import java.util.*;
import java.io.*;
import java.math.*;

public class ComparatorUsage {

	public static void main(String[] args) {
		
		//Comparator 사용
		Car carA = new Car(110d, 120d);
		Car carB = new Car(120d, 100d);
		
		int speedCar = carA.compare(carA, carB);
		
		if(speedCar>0) System.out.println("carA가 carB보다 빠르다");
		else if(speedCar==0)  System.out.println("carA와 carB의 속도는 같다");
		else System.out.println("carA가 carB보다 느리다");
		
	}
	
}


class Car implements Comparator<Car>{

	private double speed;
	private double fuelTank;
	
	public Car(double speed, double fuelTank) {
		this.speed = speed;
		this.fuelTank = fuelTank;
	}
	
	@Override
	public int compare(Car o1, Car o2) {
		if(o1.speed > o2.speed) return 1;
		else if(o1.speed == o2.speed) return 0;
		else return -1;
	}

}
