import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		/*
		 * Artık Yıl Hesaplayan Program Java ile kullanıcının girdiği yılın artık olup
		 * olmadığını bulan programı yazınız.
		 * 
		 * Artık Yıl Nedir?
		 * 
		 * Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün
		 * (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde
		 * edilir.
		 * 
		 * Artık Yıl Nasıl Hesaplanır?
		 * 
		 * Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
		 * 
		 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi. 100'ün katı
		 * olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
		 * 
		 * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık
		 * yıl değildir. Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul
		 * edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak
		 * 365,242 gün olmasından kaynaklanan hatayı gidermektir.
		 */

		int year;
		boolean isLeap = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Yıl Giriniz: ");
		year = input.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {// eğer girilen yıl 100ün katıysa
				if (year % 400 == 0)
					isLeap = true; // 400ün katı olduğu için artık yıldır
				else
					isLeap = false; // 400ün katı olmadığından artık yıl değil
			}

			else {
				isLeap = true; // 4ün katı ve 100ün katı olmadığı için artık yıl
			}
		} 
		
		
		else {
			isLeap = false; // artık yıl değil
		}

		if (isLeap == true)
			System.out.println(year + " yılı artık bir yıldır.");
		else
			System.out.println(year + " yılı artık bir yıl değildir.");
	}

}
