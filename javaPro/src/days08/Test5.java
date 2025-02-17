package days08;

import java.io.IOException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws IOException {
//		2. 두 정수(n,m)을 입력받아서 두 정수 사이의 짝수의 합을 구해서 출력하는 코딩을 하세요.
		Scanner sc = new Scanner(System.in);
		int n, m;
		int sum = 0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int min = Math.min(n,m);
		int max = n > m ? n : m;
		for (int i = min; i <= max ; i++) {
			if(n % 2 == 0)System.out.printf("%d+", i);
			sum += i;
			
		} // for i
		

		
	}


}
