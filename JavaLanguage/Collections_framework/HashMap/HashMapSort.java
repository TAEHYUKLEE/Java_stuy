package HashMapSort;

import java.util.*;

public class HashMapSort {

	public static void main(String[] args) {
		 
        Map<String, String> map = new HashMap<>();
        map.put("Nepal", "Kathmandu");
        map.put("United States", "Washington");
        map.put("India", "New Delhi");
        map.put("England", "London");
        map.put("Australia", "Canberra");

        //Key를 set으로 빼온걸 ArrayList로 넣어준다.      
        List<String> keyList = new ArrayList<String>(map.keySet());
        //keyList.sort((s1, s2) -> s1.compareTo(s2));
        
        System.out.println(keyList.toString());
        
        //key만 있는 array List를 sort해준다
        Collections.sort(keyList);
        
        System.out.println(keyList);
        
        
        //다시 array
        for (String key : keyList) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
		
	}
}
