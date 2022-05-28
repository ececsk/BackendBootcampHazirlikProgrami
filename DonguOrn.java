import java.util.Scanner;

public class DonguOrn {

	public static void main(String[] args) {
		// Kullanýcýdan negatif sayý alana kadar girdi alan program
		Scanner input = new Scanner(System.in);
		int num;

		// FOR ile
		/*
		 * for (boolean run = true; run;) { 
		 * System.out.println("Sayý Giriniz: ");
		 * num=input.nextInt(); if(num<0) { 
		 * run=false;
		 * System.out.println("Negatif sayý girildi.");
		 *  }
		 * 
		 * }
		 */

		// WHILE ile
		/*
		 * System.out.println("Sayý Giriniz: "); 
		 * num = input.nextInt(); 
		 * while (num > 0)
		 * { System.out.println("Sayý Giriniz: "); 
		 * num = input.nextInt(); }
		 * System.out.println("Negatif sayý girildi ve döngü sonlandý."); 
		 * }
		 */
		// DO WHILE
		do {
			System.out.println("Sayý Giriniz: ");
			num = input.nextInt();
		}

		while (num > 0);
		System.out.println("Negatif sayý girildi ve döngü sonlandý.");
	}
}
