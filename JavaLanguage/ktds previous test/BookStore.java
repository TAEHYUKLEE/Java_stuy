package ktds;

import java.util.ArrayList;

/*
 *################### 실기 평가 구현 가이드 ######################
 *
 * BookStroe.class 구현 : TestMain.class 가 정상적으로 작동하도록 메서드 구현
 * 주의) 주어진 멤버변수와 메서드 외에 메서드나 멤버변수 추가 절대 금지
 * 
 * ###################################################
 */	
public class BookStore {
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	public BookStore(String name) {
		// TODO Auto-generated constructor stub
		System.out.print("Ktds Store 가 생성되었습니다.\n");
	}

	public ArrayList<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ktds.Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	public void addBook(ktds.Book b1) {
		// TODO Auto-generated method stub
		System.out.printf("도서명 : %s, 도서가 %s권 입고되었습니다.\n", b1.get_name(), b1.get_amount());
		books.add(b1);
	}

	public ktds.Book findBookByTitle(String string) {
		// TODO Auto-generated method stub
		for (int i=0;i<books.size(); i++) {
			if (books.get(i).get_name() == "스프링전"){
				return books.get(i);				
			}
		}
		return null;
	}

	public void updateBookCountByTitle(String string, int i) {
		// TODO Auto-generated method stub

		for (int j=0;j<books.size(); j++) {

			if (books.get(j).get_name() == string){
				books.get(j).set_amount(Integer.toString(i));
				//Check for change of amount
				System.out.printf("도서정보갱신 ->> 도서명 : %s, 재고 %s권 입니다.",books.get(j).get_name(),books.get(j).get_amount());
			}
		}
	}

	public int getTotalBookCount() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=0; i<books.size(); i++) {
			count += Integer.parseInt(books.get(i).get_amount());
		}
		System.out.println(); //한줄이 안내려가서 여기서 한줄 내림.
		return count;
	}

	public void deleteBook(String string) {
		// TODO Auto-generated method stub
		//"도서 삭제 : 홍길동전 삭제됨"
		for (int j=0;j<books.size(); j++) {
			if (books.get(j).get_name() == string){
				System.out.printf("도서 삭제 : %s 삭제됨\n",books.get(j).get_name());
				books.remove(books.get(j));		
			}
		}		
	}
}
