package timeCheck;

public class TimeCheck {
	
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
        
		//실험할 코드 추가
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
		    for (int j = 0; j < 50000; j++) {
		        sum += i*j;
		    }
		}
		System.out.println(sum);
		    
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("시간차이(m) : "+secDiffTime);
	}
	
}
