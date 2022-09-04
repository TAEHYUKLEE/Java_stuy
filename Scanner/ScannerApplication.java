package JavaScanner;

import java.util.*;
import java.io.*;

/*
 * 
5 5 
0 0 0 0 0
0 0 0 2 0
0 0 0 0 0
2 2 2 0 0
0 0 0 0 0
1 1

Result
0 1 0 0 0 
1 1 1 2 0 
0 1 0 0 0 
2 2 2 0 0 
0 0 0 0 0 
 * 
 * */


public class ScannerIn {
	
	static int Row, Col, Sr, Sc;
	static int[][] Board = new int[100][100];
	
	
	public static void printArray(int[][] Board) {
		
		for(int i=0; i< Row; i++) {
			for(int j=0; j< Col; j++) {
				System.out.print( Board[i][j] + " "); 
			}
			System.out.println("");
		}
	}
	
	static void cross(int[][] Board) {
		//가로(열) 십자가
		//0 ~ Sc까지
		for(int j=Sr; j >=0; j--) { //반 나눠서 어떤 기준으로 아래면 -- 연산자를 쓰는게 더 낫다.
			if(Board[Sr][j] == 2) break;
			Board[Sr][j] = 1;
		}
		
		//Sc ~ Row까지
		for(int j=Sc; j <Row; j++) {
			if(Board[Sr][j] == 2) break;
			Board[Sr][j] = 1;
		}
		
		
		//세로(행) 십자가
		//0 ~ Sr까지
		for(int i=Sr-1; i >=0 ; i--) {
			if(Board[i][Sr] == 2) break;
			Board[i][Sr] = 1;
		}
		
		//Sc ~ Col까지
		for(int i=Sr; i< Row; i++) {
			if(Board[i][Sr] == 2) break;
			Board[i][Sr] = 1;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in은 사용자로부터 입력을 받기 위한 입력 스트림.
		//참고 문헌 - https://st-lab.tistory.com/41
		
		//Input
		Row = sc.nextInt();
		Col = sc.nextInt();
		for(int i=0; i< Row; i++) {
			for(int j=0; j< Col; j++) {
				Board[i][j] = sc.nextInt();
			}
		}
		
		Sr = sc.nextInt();
		Sc = sc.nextInt();
		
		cross(Board);
		printArray(Board); //C++에서는 &Board or Board
		


	}

}
