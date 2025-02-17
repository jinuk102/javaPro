package days05;

public class Ex02 {

	public static void main(String[] args) {
		
		String n1 = "admin", n2 = "Admin";
		//대소문자를 구분하지않고 문자열비교
//		n1 = n1.toLowerCase();
//		n2 = n2.toLowerCase();
		
//		System.out.println( n1.equalsIgnoreCase(n2) );
		System.out.println(n1.equalsIgnoreCase(n2));
		System.out.println(n1.equals(n2));
		
		/* [1] 풀이
		System.out.println( n1.equals(n2) ? "같다" : "다르다");
		
		if (n1.equals(n2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		*/
	}

}
