package JavaScanner;

import java.util.*;
import java.io.*;


public class ScannerIn {
	
	static int Row, Col;
	static int[][] Board = new int[100][100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in은 사용자로부터 입력을 받기 위한 입력 스트림.
		//참고 문헌 - https://st-lab.tistory.com/41
		
		Row = sc.nextInt();
		Col = sc.nextInt();
		for(int i=0; i< Row; i++) {
			for(int j=0; j< Col; j++) {
				Board[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i< Row; i++) {
			for(int j=0; j< Col; j++) {
				System.out.print(Board[i][j] + " ");
			}
			System.out.println();
		}

	}

}
