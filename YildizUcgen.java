import java.util.Scanner;

public class YildizUcgen {

	public static void main(String[] args) {
		// Java'da d�ng�ler kullan�larak y�ld�zlar ile ��gen yap�yoruz.
		//      *
		//     ***
		//    *****
		//   *******
		//  *********
		// ***********

		Scanner input = new Scanner(System.in);
		System.out.println("Bir Say� Giriniz: ");
		int n = input.nextInt(); // sat�r say�s�

		for (int i = 1; i <= n; i++) { // sat�rlar�m�z� elde etti�imiz

			for (int j = 1; j <= (n - i); j++) // bo�luk say�s� yani;
			{
				/*
				 * 5 bo�luk sonra 1 * bas�lm��, 4 bo�luk sonra 3 * 3 bo�luk sonra 5 * �eklinde
				 * ilerliyor bo�luk say�s�na j, y�ld�z say�s�na n-1 diyoruz
				 */

				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)// y�ld�z say�s� i�in 1 den baslay�p iki�er iki�er artt�rabiliriz ya da 2j-1 yani 2*bo�luk say�s�-1 ile y�ld�z say�m�za ula�abiliriz.
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
