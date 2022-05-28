import java.util.Scanner;

public class ArmstrongSayilar {

	public static void main(String[] args) {
		// Girilen say�n�n armstrong say� olup olmad���n� bulan program

		/*
		 * N haneli bir say�n�n basamaklar�n�n n�inci �stlerinin toplam�, say�n�n
		 * kendisine e�itse, b�yle say�lara Armstrong say� denir.
		 * 
		 * �rne�in 407 say�s�n� ele alal�m. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu
		 * verir. Bu da 407 say�s�n�n armstrong bir say� oldu�unu g�sterir.
		 * 
		 * 1342 say�s�na da bakal�m. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 say�s�
		 * 1342�ye e�it olmad��� i�in armstrong say� olmaz. Bu uygulama i�in ilk olarak
		 * say�n�n basamak say�s�n� bulmam�z gerekiyor. int/int yapt�g�m�zda virg�lden
		 * sonras�n� almad��� i�in son basamag� bu sekilde kald�rabiliyoruz.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Say� Giriniz: ");
		int number = input.nextInt();
		int basNumber = 0, tempNumber = number, basValue, result = 0, basPow;

		while (tempNumber != 0) {
			tempNumber /= 10;
			basNumber++;
		}

		tempNumber = number;// kullan�c�dan ald�g�m say�y� daha sonra kullanmam�z gerekeceginden say�y�
							// ge�ici bir yerde tutmal�y�m ��nk� d�ng�n�n sonunda say� 0 olacag�ndan
							// girilen say�y� kaybetmi� oluruz
		while (tempNumber != 0) {
			// System.out.println(tempNumber);
			basValue = tempNumber % 10;
			// 1*1*1*1=1^4
			basPow = 1;// basPowu resetledik
			for (int i = 1; i <= basNumber; i++)// �s alma k�sm� basamak say�s� kadar d�necek
			{
				basPow *= basValue;
			}

			result += basPow;
			tempNumber /= 10;
		}

		if (result == number) {
			System.out.println(number + " say�s� bir Armstrong say�d�r.");
		}

		else {
			System.out.println(number + " say�s� bir Armstrong say�s� de�ildir.");
		}
		/*
		 * // �rnegin; // 2451/10=245 // 245/10=24 // 24/10=2 // 2/10=0
		 * 
		 * // Basamak sayma i�lemi int a = 2451, basamakSayisi = 0, numberCounter = 0;
		 * while (a != 0) {// a say�m 0 olmad��� yani say� bitmedi�i s�rece program�n
		 * �al��acak 
		 * a = a / 10; // a/=10; 
		 * System.out.println(a); 
		 * numberCounter++; }
		 * 
		 * // Bir say�n�n son basama��n� bulma 
		 * 2451%10=1 
		 * int b = 2451; 
		 * int c = b %10; 
		 * System.out.println(c);
		 * 
		 * // �s alma i�lemini hat�rlayal�m 
		 * int sub = 2, sup = 3; // 2 �zeri 3 int
		 * result = 1; 
		 * for (int i = 1; i <= sup; i++) 
		 * { result *= sub; }
		 * System.out.println(result);
		 * 
		 */
	}
}
