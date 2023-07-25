public class RegexJava {
    public static void main(String[] args) {
        String pwd = "good12!@"; // 검사할 비밀번호
//        String sepRegEx = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*";
        
        
        //영문자만 있는가?
        String eng = "^[a-zA-Z]*$";
        if(Pattern.matches(eng, pwd)){
        	throw new RuntimeException("영문자만 있습니다.");
        }
        //숫자만 있는가?
        String numRegExp = "^[0-9]*$";
        if(Pattern.matches(numRegExp, pwd)){
        	throw new RuntimeException("숫자만 있습니다.");
        }
        //특수문자 하나 이상 있는가?
        String sepRegEx = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*";
        if(!Pattern.matches(sepRegEx, pwd)){
            throw new RuntimeException("특수문자가 없습니다!");
        };

        // 공백 포함 여부를 판단하기 위한 정규식
        String spaceRegEx = ".*\\s+.*";
        if(Pattern.matches(spaceRegEx, pwd)){
        	throw new RuntimeException("공백이 포함되어 있습니.");
        };

        
       System.out.println("통과!");

	   }
}
