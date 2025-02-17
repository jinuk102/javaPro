package days05;
/**
 * @author jaewon
 * @date 2025. 2. 7. -  오전 11:09:07
 * @subject 조건반복문 while문
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while (++i <= 3) {
			 System.out.printf("%d+", i);
			 sum += i;
			 
			 //i++;
		}
		System.out.printf("=%d",sum);
		
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("%d+", i);
		} // for i
			System.out.printf("=%d",sum);
		*/
	} // main

} // class
