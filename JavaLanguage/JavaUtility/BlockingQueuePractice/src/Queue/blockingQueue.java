package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class blockingQueue {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
        
		//실험할 코드 추가
		int capacity = 2;
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

		try {
		    long timeout = 2000;
		    System.out.println("success: " + queue.offer(1, timeout, TimeUnit.MILLISECONDS));
		    System.out.println("success: " + queue.offer(2, timeout, TimeUnit.MILLISECONDS));

		    boolean success = queue.offer(6, timeout, TimeUnit.MILLISECONDS);
		    System.out.println("success: " + success);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("시간차이(m) : "+secDiffTime);
		
		
		long beforeTime1 = System.currentTimeMillis();
		try {
		    long timeout1 = 5000;
		    System.out.println("success: " + queue.poll(timeout1, TimeUnit.MILLISECONDS));
		    System.out.println("success: " + queue.poll(timeout1, TimeUnit.MILLISECONDS));
		    //queue가 비어 있어도 poll에 timeout을 setting한다면 5초간 기달려준다.
		    //offer에 timeout이 붙어 있으면 다 차 있어도 timeout1(ms)동안 기달렸다가 넣어준다
		    System.out.println("success: " + queue.offer(10, timeout1, TimeUnit.MILLISECONDS));
		    
		    System.out.println("success: " + queue.poll(timeout1, TimeUnit.MILLISECONDS));
		} catch (Exception e) {
		    e.printStackTrace();
		}
		long afterTime1 = System.currentTimeMillis(); 
		long secDiffTime1 = (afterTime1 - beforeTime1)/1000;
		System.out.println("시간차이(m) : "+secDiffTime1);
		    

	}

}
