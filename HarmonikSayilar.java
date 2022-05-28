import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		// Java ile girilen say�n�n harmonik serisini bulan program
		// harmonik seri form�l�: 1+(1/2)+(1/3)+(1/4)+(1/n)
		
		/* Amac�m�z serinin de�i�keni olan bir n degi�kenini pozisyon al�p o de�i�kene kadar olan
		 harmonik seriyi hesaplayan program� yazmak*/

		Scanner input = new Scanner(System.in);

		System.out.println("N say�s�n� giriniz: ");

		double n = input.nextInt();
		double result = 0;

		for (double i = 1; i <= n; i++) {
			result += (1 / i);// (int i olarak)bu �ekilde yazarsak n=2 i�in 1.0 de�erini d�nd�r�r ��nk� burada
								// java int/int oldu�u i�in sonucun int olmas�n� bekliyor
			// e�er iyi double tan�mlarsak yukar�daki kodumuzda da do�ru sonucu al�r�z.
			// result+=(1.0/i);
		}
		// for d�ng�s� i�in:
		// 1.d�ng� i=1;result 0+(1/1)=1
		// 2.d�ng� i=2;result=1+(1/2)=1.5

		/*while (n > 0) {
			result += (1 / n);
			n--;
		}*/
		System.out.println(result);
	}

}
