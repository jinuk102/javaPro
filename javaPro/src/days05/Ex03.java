package days05;

public class Ex03 {

	public static void main(String[] args) {
		//[문제] 1+2+3+.......9+10+55 for문
		/*
		String name = "홍길동";
		name = name + "이진욱";
		System.out.println( name );
		*/
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("=%d", sum);
		
		
		
		/*
		int i;
		int sum;
		for (i = 1; i <= 10; i++) {
			// sum += i;
			
		} // for i
		System.out.println(">> 빠져나올떄의 i = " + i);
		*/
	} // main
	
} // class
