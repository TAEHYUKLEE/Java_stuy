import java.util.*;
import java.io.*;

class Person implements Comparable<Person>{
	
	int idx;
	int score;
	
	public Person(int idx, int score) {
		this.idx = idx;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "idx: " + this.idx + " score: " + this.score + "|";
	}
	

	@Override
	public int compareTo(Person person) {
//		if(this.score - person.score>0) {
//			return 1;
//		}else if(this.score == person.score) {
//			return 0;
//		}else {
//			return -1;
//		}
		return (this.score - person.score)*(-1);
	}
	
}

public class PriorityQueueUsage {

	public static void main(String[] args) {
		
		PriorityQueue<Person> pq = new PriorityQueue<Person>();
		
		//Queue<Integer> q = new LinkedList<>();
		Person person1 = new Person(1, 30);		
		Person person2 = new Person(2, 100);
		Person person3 = new Person(3, 10);
		Person person4 = new Person(4, 60);
		Person person5 = new Person(5, 50);
		
		pq.add(person1);
		pq.add(person2);
		pq.add(person3);
		pq.add(person4);
		pq.add(person5);
		
		//System.out.println(pq.size());
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().score);
		}

		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		//IntegerQ
		pq1.add(5);
		pq1.add(8);
		pq1.add(10);
		pq1.add(32);
		pq1.add(3);
		
		while(!pq1.isEmpty()) {
			System.out.println(pq1.poll());
		}

	
	}
}
