import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		/*
		 * Çin Zodyaðý Hesaplayan Program Java ile kullanýcýdan doðum tarihini alýp Çin
		 * Zodyaðý deðerini hesaplayan program yazýnýz.
		 * 
		 * Çin Zodyaðý nedir?
		 * 
		 * 4000 bin yýldýr kullanýlan bir astroloji çeþididir Çin astrolojisi ve
		 * insanlarý 12 deðiþik burç ve sembollerle tanýmlar. Çin Zodyaðý bu 12 burcun
		 * eþit aralýklarla(10 derece geniþliðinde) sýralandýðý bir hayvan halkasýdýr ve
		 * yýldýzlarla pek bir ilgisi yoktur.
		 * 
		 * Çin zodyaðý hesaplanýrken kiþinin doðum yýlýnýn 12 ile bölümünde kalana göre
		 * bulunur.
		 * 
		 * Doðum Tarihi %12 = 0 -> Maymun
		 * 
		 * Doðum Tarihi %12 = 1 -> Horoz
		 * 
		 * Doðum Tarihi %12 = 2 -> Köpek
		 * 
		 * Doðum Tarihi %12 = 3 -> Domuz
		 * 
		 * Doðum Tarihi %12 = 4 -> Fare
		 * 
		 * Doðum Tarihi %12 = 5 -> Öküz
		 * 
		 * Doðum Tarihi %12 = 6 -> Kaplan
		 * 
		 * Doðum Tarihi %12 = 7 -> Tavþan
		 * 
		 * Doðum Tarihi %12 = 8 -> Ejderha
		 * 
		 * Doðum Tarihi %12 = 9 -> Yýlan
		 * 
		 * Doðum Tarihi %12 = 10 -> At
		 * 
		 * Doðum Tarihi %12 = 11 -> Koyun
		 */

		int remainder;
		String zodiac = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Doðum yýlýnýzý yyyy formatýnda giriniz: ");
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
			zodiac = "Köpek";
			break;
		case 3:
			zodiac = "Domuz";
			break;
		case 4:
			zodiac = "Fare";
			break;
		case 5:
			zodiac = "Öküz";
			break;
		case 6:
			zodiac = "Kaplan";
			break;
		case 7:
			zodiac = "Tavþan";
			break;
		case 8:
			zodiac = "Ejderha";
			break;
		case 9:
			zodiac = "Yýlan";
			break;
		case 10:
			zodiac = "At";
			break;
		case 11:
			zodiac = "Koyun";
			break;
		}
		System.out.println("Çin Burcunuz: " + zodiac);

	}

}
