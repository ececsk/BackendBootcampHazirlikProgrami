import java.util.Scanner;

public class DonguOrn {

	public static void main(String[] args) {
		// Kullan�c�dan negatif say� alana kadar girdi alan program
		Scanner input = new Scanner(System.in);
		int num;

		// FOR ile
		/*
		 * for (boolean run = true; run;) { 
		 * System.out.println("Say� Giriniz: ");
		 * num=input.nextInt(); if(num<0) { 
		 * run=false;
		 * System.out.println("Negatif say� girildi.");
		 *  }
		 * 
		 * }
		 */

		// WHILE ile
		/*
		 * System.out.println("Say� Giriniz: "); 
		 * num = input.nextInt(); 
		 * while (num > 0)
		 * { System.out.println("Say� Giriniz: "); 
		 * num = input.nextInt(); }
		 * System.out.println("Negatif say� girildi ve d�ng� sonland�."); 
		 * }
		 */
		// DO WHILE
		do {
			System.out.println("Say� Giriniz: ");
			num = input.nextInt();
		}

		while (num > 0);
		System.out.println("Negatif say� girildi ve d�ng� sonland�.");
	}
}
