package days05;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		// 자바에서 임의의 수를 발생시키는 코딩.
		// 1) Math.random()
		// 2) Random 클래스 

		//		System.out.println(Math.abs(10));
		//		System.out.println(Math.abs(-10));

		//3 ~19사이의 점수
		// > user 가위(1)/바위(2)보(3) 선택 ? 3
		// > com=1, user=3
		//컴퓨터 승리 유저승리
		int user = 0;
		int com = 0;

		Scanner sc = new Scanner(System.in);
		System.out.printf("> user 가위(1)/바위(2)/보(3) 선택 ?");
		user = sc.nextInt();
		com  = ((int)(Math.random()*3) + 1);

		switch (com) {
		case 1:
			switch (user) 
			{
			case 1:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("무승부");
				break;
			case 2:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("유저 승리");
				break;
			case 3:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("컴퓨터 승리");
				break;		
			} // switch
			break;
		case 2:		
			switch (user) 
			{
			case 1:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("컴퓨터 승리");
				break;
			case 2:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("무승부");
				break;
			case 3:
				System.out.printf("com=%d, user=%d\n", com, user);
				System.out.printf("유저 승리");
				break;		
			} // switch

			break;
		case 3:
			switch (user) 
			{
			case 1:
					System.out.printf("com=%d, user=%d\n", com, user);
					System.out.printf("유저 승리");
					break;
			case 2:
					System.out.printf("com=%d, user=%d\n", com, user);
					System.out.printf("컴퓨터 승리");
					break;
			case 3:
					System.out.printf("com=%d, user=%d\n", com, user);
					System.out.printf("무승부");
					break;		
			} // switch
			break;

		
		} // switch

		/*
		int lottoNumber;

		for (int i = 1; i <= 6; i++) { 	

			lottoNumber = (int)(Math.random) * 45)+1;


		} // for
		 */

		// 로또 번호 1~45 임의의 수 6개...
		//국어 0 ~ 100









	} // main

} // class
