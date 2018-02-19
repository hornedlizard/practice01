package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		int number = scanner.nextInt();
		int sum = 0;
		int x=0;
		if (number%2!=0) {
			System.out.println("홀수 입력 받음");
			if (number/2!=0) {
				x = (number+1)/2;
				sum = (number+1)*x/2;
			} else {
				x = (number)/2;				
				sum = (number+1)*x/2;
			}
			System.out.println(sum);			
		} else {
			System.out.println("짝수 입력 받음");
			x = Math.round(number/2);
			sum = (number+2)*x/2;
			System.out.println(sum);
		}
	}

}
