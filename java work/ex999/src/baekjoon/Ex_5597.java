package baekjoon;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_5597 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[31];
	// 0~31이니까 번호는 1부터 시작하니까 31이 필요
		
	for (int i = 1; i <= 28; i++) {
		arr[scan.nextInt()]++;
	}
	
	for (int i = 1; i <= 30; i++) {
		if (arr[i] == 0) {
			System.out.println(i);
			}
		
		}
	}
}
