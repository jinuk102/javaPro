package Test;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\Ex10.java";
		int code = -1;
		int [] counts = new int[62];

		try (FileReader reader = new FileReader(fileName);){

			while ( (code = reader.read()) != -1 ) {
				//				code = Character.toUpperCase(code);
				if ( Character.isUpperCase(code) ) {
					int index = code -'A';
					counts[index]++;
				} // if
				else if(Character.isLowerCase(code)) {
					int index = 26 + (code - 'a');
					counts[index]++;
				}else if(Character.isDigit(code)) {
					int index = (code - '0') + 52;
					counts[index]++;
				}
			} // while

			// 막대그래프 그리기
			for (int i = 0, count; i < 26; i++) {
				count  = counts[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i
			for (int i = 26, count; i < 52; i++) {
				count  = counts[i];
				System.out.printf("%c(%d) %s\n", 
						(i-26)+'a', count, "#".repeat(count));
			} // for i
			for (int i = 52, count; i < 62; i++) {
				count  = counts[i];
				System.out.printf("%c(%d) %s\n", 
						(i-52)+'0', count, "#".repeat(count));
			} // for i
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

} // class
