package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		int size = text.length();
		
		for (int i = 1; i <= size; i++) {
				System.out.println(text.substring(0, i));
		}
	}
}