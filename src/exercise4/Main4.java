package exercise4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
countDown();
	}
	
	public static void countDown() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero da cui far partire il conto alla rovescia");
		int input= scanner.nextInt();
		for (int i = input; i>=100; i--) {
			System.out.println(i);
		}
		scanner.close();
	}

}
