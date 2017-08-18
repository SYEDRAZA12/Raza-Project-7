package inputAndException;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {

		System.out.println("Please enter any two numbers");
		Scanner sc = new Scanner(System.in);

		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int result = input1 + input2;
		System.out.println("Your Answer is  : " + result);

		sc.close();

		try {
			if (sc != null) {
				sc.close();
			}
		} catch (Exception ex) {
			System.out.println("Scanner is not closed  yet");

		} finally {
			sc.close();
		}

	}

}
