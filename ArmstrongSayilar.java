import java.util.Scanner;

public class ArmstrongSayilar {

	public static void main(String[] args) {
		// Girilen sayýnýn armstrong sayý olup olmadýðýný bulan program

		/*
		 * N haneli bir sayýnýn basamaklarýnýn n’inci üstlerinin toplamý, sayýnýn
		 * kendisine eþitse, böyle sayýlara Armstrong sayý denir.
		 * 
		 * Örneðin 407 sayýsýný ele alalým. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu
		 * verir. Bu da 407 sayýsýnýn armstrong bir sayý olduðunu gösterir.
		 * 
		 * 1342 sayýsýna da bakalým. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayýsý
		 * 1342’ye eþit olmadýðý için armstrong sayý olmaz. Bu uygulama için ilk olarak
		 * sayýnýn basamak sayýsýný bulmamýz gerekiyor. int/int yaptýgýmýzda virgülden
		 * sonrasýný almadýðý için son basamagý bu sekilde kaldýrabiliyoruz.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Sayý Giriniz: ");
		int number = input.nextInt();
		int basNumber = 0, tempNumber = number, basValue, result = 0, basPow;

		while (tempNumber != 0) {
			tempNumber /= 10;
			basNumber++;
		}

		tempNumber = number;// kullanýcýdan aldýgým sayýyý daha sonra kullanmamýz gerekeceginden sayýyý
							// geçici bir yerde tutmalýyým çünkü döngünün sonunda sayý 0 olacagýndan
							// girilen sayýyý kaybetmiþ oluruz
		while (tempNumber != 0) {
			// System.out.println(tempNumber);
			basValue = tempNumber % 10;
			// 1*1*1*1=1^4
			basPow = 1;// basPowu resetledik
			for (int i = 1; i <= basNumber; i++)// üs alma kýsmý basamak sayýsý kadar dönecek
			{
				basPow *= basValue;
			}

			result += basPow;
			tempNumber /= 10;
		}

		if (result == number) {
			System.out.println(number + " sayýsý bir Armstrong sayýdýr.");
		}

		else {
			System.out.println(number + " sayýsý bir Armstrong sayýsý deðildir.");
		}
		/*
		 * // örnegin; // 2451/10=245 // 245/10=24 // 24/10=2 // 2/10=0
		 * 
		 * // Basamak sayma iþlemi int a = 2451, basamakSayisi = 0, numberCounter = 0;
		 * while (a != 0) {// a sayým 0 olmadýðý yani sayý bitmediði sürece programýn
		 * çalýþacak 
		 * a = a / 10; // a/=10; 
		 * System.out.println(a); 
		 * numberCounter++; }
		 * 
		 * // Bir sayýnýn son basamaðýný bulma 
		 * 2451%10=1 
		 * int b = 2451; 
		 * int c = b %10; 
		 * System.out.println(c);
		 * 
		 * // üs alma iþlemini hatýrlayalým 
		 * int sub = 2, sup = 3; // 2 üzeri 3 int
		 * result = 1; 
		 * for (int i = 1; i <= sup; i++) 
		 * { result *= sub; }
		 * System.out.println(result);
		 * 
		 */
	}
}
