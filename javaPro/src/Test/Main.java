package Test;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int [] n = new int[len];
		for (int i = 1; i <= n.length; i++) {
			n[i-1] = i;
			System.out.printf("%d\n",n[i-1]);
		} // for i
		
		
//		첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
	} // main

} // class