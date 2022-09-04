package BufferReader;

import java.util.*;
import java.io.*;
import java.math.*;



public class BufferReaderIn {
	
	static int Row;
	static int Col;
	static int[][] Board = new int[100][100];
	

	public static void main(String[] args) throws IOException {
		
		//InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		//Scanner sc = new Scanner(inputStreamReader);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //한줄씩 읽게됨.
		
		Row = Integer.parseInt(st.nextToken());
		Col = Integer.parseInt(st.nextToken());
		
		/*
		 * InputStremaReader와 InputStream에 대해서 좀 제대로 공부해보자
		 * */
		
		
	}
}
