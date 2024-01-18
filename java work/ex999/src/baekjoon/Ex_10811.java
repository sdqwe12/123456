package baekjoon;

import java.util.Scanner;

public class Ex_10811 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt(); // 바구니 개수
	int M = scan.nextInt(); // 역순 몇번 하는지
	int[] arr = new int[N];
	
	for (int i = 1; i <= N; i++) {
		arr[i] = i; //바구니에 1번부터 번호
	}
	for (int j = 1; j <= M; j++) { //m개의 줄 입력
		int I = scan.nextInt();
		int J = scan.nextInt();
		
		if (condition) {
			
   } //if
  } //for
 } //main
} //class
