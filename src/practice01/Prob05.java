package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 99; i++) {
			if (i%3==0 || i%6==0 || i%9==0) {
				System.out.println(i+"짝");
			}
		}
	}

}
