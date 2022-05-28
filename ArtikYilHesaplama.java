import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		/*
		 * Art�k Y�l Hesaplayan Program Java ile kullan�c�n�n girdi�i y�l�n art�k olup
		 * olmad���n� bulan program� yaz�n�z.
		 * 
		 * Art�k Y�l Nedir?
		 * 
		 * Art�k y�l, Milad� takvimde 365 yerine 366 g�n� olan y�l. Bu fazladan g�n
		 * (art�k g�n), normalde 28 g�n olan �ubat ay�na 29 �ubat��n eklenmesi ile elde
		 * edilir.
		 * 
		 * Art�k Y�l Nas�l Hesaplan�r?
		 * 
		 * Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r:
		 * 
		 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi. 100'�n kat�
		 * olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k y�ld�r:
		 * 
		 * �rne�in 1200, 1600, 2000 y�llar� art�k y�ld�r ancak 1700, 1800 ve 1900 art�k
		 * y�l de�ildir. Sadece 400'e tam olarak b�l�nebilenlerin art�k y�l kabul
		 * edilmesinin nedeni, bir astronomik y�l�n 365,25 g�n de�il, yakla��k olarak
		 * 365,242 g�n olmas�ndan kaynaklanan hatay� gidermektir.
		 */

		int year;
		boolean isLeap = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Y�l Giriniz: ");
		year = input.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {// e�er girilen y�l 100�n kat�ysa
				if (year % 400 == 0)
					isLeap = true; // 400�n kat� oldu�u i�in art�k y�ld�r
				else
					isLeap = false; // 400�n kat� olmad���ndan art�k y�l de�il
			}

			else {
				isLeap = true; // 4�n kat� ve 100�n kat� olmad��� i�in art�k y�l
			}
		} 
		
		
		else {
			isLeap = false; // art�k y�l de�il
		}

		if (isLeap == true)
			System.out.println(year + " y�l� art�k bir y�ld�r.");
		else
			System.out.println(year + " y�l� art�k bir y�l de�ildir.");
	}

}
