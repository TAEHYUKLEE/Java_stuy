package ktds;
/*
 *################### 실기 평가 구현 가이드 ######################
 *
 * Book.class 구현 : TestMain.class 가 정상적으로 작동하도록 메서드 구현
 * 주의) 주어진 멤버변수와 메서드 외에 메서드나 멤버변수 추가 절대 금지
 * 
 * ###################################################
 */	
public class Book {
	//도서 제목
	private String name;
	//도서 가격
	private String price;
	//도서 수량
	private String amount; //겟터셋터 getter setter
	
	//constructor
	public Book(String name, int price, int amount) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = Integer.toString(price);
		this.amount = Integer.toString(amount);
		}
	
	//getter or private을 지우거나 (public으로 하면 java의 객체 지향 언어 정신이 파괴된다함)
	public String get_name() {
		return name;
	}
	public String get_price() {
		return price;
	}	
	public String get_amount() {
		return amount;
	}		
	
	//setter
	public String set_name(String name) {
		this.name = name;
		return name;
	}
	public String set_price(String price) {
		this.price = price;
		return price;
	}	
	public String set_amount(String amount) {
		this.amount = amount;
		return amount;
	}		
	
	public String getBookInfo() {
		// TODO Auto-generated method stub
		return String.format("도서명 : %s, 재고는 %s권 입니다.",name,amount);
	}

}
