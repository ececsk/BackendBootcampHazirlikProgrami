import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		/*
		 * �in Zodya�� Hesaplayan Program Java ile kullan�c�dan do�um tarihini al�p �in
		 * Zodya�� de�erini hesaplayan program yaz�n�z.
		 * 
		 * �in Zodya�� nedir?
		 * 
		 * 4000 bin y�ld�r kullan�lan bir astroloji �e�ididir �in astrolojisi ve
		 * insanlar� 12 de�i�ik bur� ve sembollerle tan�mlar. �in Zodya�� bu 12 burcun
		 * e�it aral�klarla(10 derece geni�li�inde) s�raland��� bir hayvan halkas�d�r ve
		 * y�ld�zlarla pek bir ilgisi yoktur.
		 * 
		 * �in zodya�� hesaplan�rken ki�inin do�um y�l�n�n 12 ile b�l�m�nde kalana g�re
		 * bulunur.
		 * 
		 * Do�um Tarihi %12 = 0 -> Maymun
		 * 
		 * Do�um Tarihi %12 = 1 -> Horoz
		 * 
		 * Do�um Tarihi %12 = 2 -> K�pek
		 * 
		 * Do�um Tarihi %12 = 3 -> Domuz
		 * 
		 * Do�um Tarihi %12 = 4 -> Fare
		 * 
		 * Do�um Tarihi %12 = 5 -> �k�z
		 * 
		 * Do�um Tarihi %12 = 6 -> Kaplan
		 * 
		 * Do�um Tarihi %12 = 7 -> Tav�an
		 * 
		 * Do�um Tarihi %12 = 8 -> Ejderha
		 * 
		 * Do�um Tarihi %12 = 9 -> Y�lan
		 * 
		 * Do�um Tarihi %12 = 10 -> At
		 * 
		 * Do�um Tarihi %12 = 11 -> Koyun
		 */

		int remainder;
		String zodiac = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Do�um y�l�n�z� yyyy format�nda giriniz: ");
		int birthYear = input.nextInt();
		remainder = birthYear % 12;

		switch (remainder) {
		case 0:
			zodiac = "Maymun";
			break;
		case 1:
			zodiac = "Horoz";
			break;
		case 2:
			zodiac = "K�pek";
			break;
		case 3:
			zodiac = "Domuz";
			break;
		case 4:
			zodiac = "Fare";
			break;
		case 5:
			zodiac = "�k�z";
			break;
		case 6:
			zodiac = "Kaplan";
			break;
		case 7:
			zodiac = "Tav�an";
			break;
		case 8:
			zodiac = "Ejderha";
			break;
		case 9:
			zodiac = "Y�lan";
			break;
		case 10:
			zodiac = "At";
			break;
		case 11:
			zodiac = "Koyun";
			break;
		}
		System.out.println("�in Burcunuz: " + zodiac);

	}

}
