package Collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{
	
	int serial;
	String owner;
	
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}

	@Override //sort가 실행되면 compareTo가 실행된다.
	public int compareTo(Object o) {
		return this.serial  - ((Computer)o).serial;
	}
	public String toString() {
		return serial + "" + owner;
	}
	
}

public class Collections_arrange {
	
	public static void main(String[] args) {
		
		List<Computer> computers = new ArrayList<Computer>();
		ArrayList<Integer> Li = new ArrayList<Integer>();
		//왜 굳이 부모의 datatype으로 받아오는거지? ArrayList 요소들의 data type이 Computer이다
		
		computers.add(new Computer(500, "tay"));
		computers.add(new Computer(200, "GO"));
		computers.add(new Computer(3200, "Coke"));
		
		Li.add(3);
		Li.add(2);
		Li.add(5);
		
		Collections.sort(Li);
		System.out.println(Li);
		
		//객체를 sort하기 위해서는 comparable이 필요한듯
		Collections.sort(computers);
		
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
			
		Collections.sort(computers); //sort는 static이기때문에 Collections에서 바로 사용 가능
		System.out.println("\n after");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());	
			}
		
		}

	}
}
