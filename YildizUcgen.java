import java.util.Scanner;

public class YildizUcgen {

	public static void main(String[] args) {
		// Java'da döngüler kullanýlarak yýldýzlar ile üçgen yapýyoruz.
		//      *
		//     ***
		//    *****
		//   *******
		//  *********
		// ***********

		Scanner input = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz: ");
		int n = input.nextInt(); // satýr sayýsý

		for (int i = 1; i <= n; i++) { // satýrlarýmýzý elde ettiðimiz

			for (int j = 1; j <= (n - i); j++) // boþluk sayýsý yani;
			{
				/*
				 * 5 boþluk sonra 1 * basýlmýþ, 4 boþluk sonra 3 * 3 boþluk sonra 5 * þeklinde
				 * ilerliyor boþluk sayýsýna j, yýldýz sayýsýna n-1 diyoruz
				 */

				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)// yýldýz sayýsý için 1 den baslayýp ikiþer ikiþer arttýrabiliriz ya da 2j-1 yani 2*boþluk sayýsý-1 ile yýldýz sayýmýza ulaþabiliriz.
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
