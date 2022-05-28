import java.util.Scanner;

public class IkininKuvveti {

	public static void main(String[] args) {
		// Girilen Sayýdan Küçük 2'nin Kuvvetlerini ekrana yazdýran program
		
		Scanner input = new Scanner(System.in);
		int n;

		System.out.println("Sayi Giriniz: ");
		n = input.nextInt();

		if (n > 0) {
			// 2^0=1 oldugu için i=1 ile baþladýk.
			for (int i = 1; i <= n; i *= 2)// i=i*2
			{
				System.out.println(i);
			}
		}

		/*
		 * i i*=2 
		 * 1 2 
		 * 2 4 
		 * 3 8 
		 * 4 16 
		 * ...
		 */

	}

}
