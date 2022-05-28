import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		// Kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan program

		Scanner input = new Scanner(System.in);

		int a, n;

		System.out.print("Üssü alýnacak sayý: ");
		a = input.nextInt();
		System.out.print("Üs deðeri:");
		n = input.nextInt();

		/*
		 * int i=1, total=1;
		 * 
		 * while(i<=n) { total=total*a; //total*=a; i++; }
		 */
		// Ödev For ile yapýmý

		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * a;
		}

		System.out.println("Sonuç: " + total);

	}

}
