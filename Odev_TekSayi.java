import java.util.Scanner;

public class Odev_TekSayi {

	public static void main(String[] args) {
		/*
		 * Tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve girilen
		 * deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan program
		 */
		Scanner input = new Scanner(System.in);
		int n, sum = 0;

		do {
			System.out.println("Sayi Giriniz: ");
			n = input.nextInt();

			if (n % 2 == 0 && n % 4 == 0) {
				sum += n;
			}

		} while (n % 2== 0); // n%2!=1

		System.out.println("Toplam= " + sum);
	}

}
