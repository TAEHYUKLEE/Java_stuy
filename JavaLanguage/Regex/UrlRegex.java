package JavaRegex;

import java.util.regex.Pattern;

public class JavaRegex {
	
    private static String httpsPattern = "^(http(s)?):\\/\\/";
    private static String domainPattern = "([^:\\/\\^[ㄱ-ㅎ가-힣]*$]+)";
    private static String portPattern = "([:][0-9]?[0-9]?[0-9]?[0-9]?[0-9]?)";
	
	
	public static void main(String[] args) {
		
		//http url관련 pattern 체크.
		
		String url = "https://retool.dev:44311";

		System.out.println(parseAndPatternCheck(url));
		
		
	}
	
	 private static boolean parseAndPatternCheck(String url){

	        //parsing할 위치를 파악한다.
	        int httpInitial = 0;
	        int httpLast = url.indexOf("://") + 3;

	        int domainInitial = httpLast;
	        int domainLast = url.lastIndexOf(":");

	        int portInitial = domainLast;
	        int portLast = url.length();

	        //목표가 되는 문자열들을 parsing한다.
	        String http = url.substring(httpInitial, httpLast); //예시 http:// or https://
	        String domain = url.substring(domainInitial, domainLast); //예시 - naver.com
	        String port = url.substring(portInitial, portLast); //예시 - :58423

	        boolean httpBool = Pattern.matches(httpsPattern, http);
	        boolean domainBool = Pattern.matches(domainPattern, domain);
	        boolean portBool = Pattern.matches(portPattern, port);
	        
	        System.out.println("http 형식은 다음과 같습니다 "  + http + " 길이는 " + http.length());
	        System.out.println("domain 은 다음과 같습니다 "  + domain + " 길이는 " + domain.length());
	        System.out.println("port는 다음과 같습니다 "  + port + " 길이는 " + port.length());
	        
	        if(!httpBool || !domainBool || !portBool || domain.length()>50 || port.length()>6 || http.length()>8){
	        	System.out.println("도메인 형식에 맞지 않습니다.");
	            return false;
	        }


	        return true;
	    }
}
