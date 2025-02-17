package days05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {	
				
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[31];
	
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		} // for i
		int count = 0;
		
		int r = 0;
		
		
		System.out.println("베스킨라비슨31 게임시작");
		
		while (count != nums.length) {
			if(count < 27) {
				r  = ((int)(Math.random()*3) + 1);
			}
			else if(count == 27) {
				r = 3;
			}
			else if(count == 28) {
				r = 2;
			}
			else if(count == 29) {
				r = 1;
			}
			
			System.out.print("com : ");
			
			for (int i = 0; i < r; i++) {
					System.out.printf("%d ", nums[count]);
					count++;
			} // for i
			System.out.println();
			if (count > 31) {
				System.out.println("User승! com패!");
				break;
			} // if
			System.out.print("몇 개 부르시겠습니까? (1~3) : ");
			
			int num = sc.nextInt();
			
			while (num > 3 || num < 1) {
				System.out.println("1~3사이의 숫자를 입력하세요");
				System.out.println("몇개 부르시겠습니까?");
				num = sc.nextInt();
			} // while
			if (count == 29) {
				if (num != 1) {
					num = 2;
				} // if
			} // if
			else if(count == 30) {
				num = 1;
			}
			System.out.print("user : ");
			for (int i = 0; i < num; i++) {
				System.out.printf("%d ",nums[count]);
				count++;
			} // for i
			System.out.println();
			if(count > 30) {
				System.out.println("com 승! user 패!");
				break;
			}
			
		} // while
		
		
			
		
	}

}
//System.out.println("베스킨라비슨31 게임시작");
//System.out.printf("플레이어는 숫자 개수를 입력하세요 (1~3): ");