import java.util.Scanner;
public class KullaniciGirisOdev {

	public static void main(String[] args) {
		/*E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n� sorun,
		 * e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , 
		 * �ifreler ayn� ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." 
		 * sorun yoksa "�ifre olu�turuldu" yazan program� yaz�n�z.*/
		
		Scanner input=new Scanner(System.in);
		
		String username,password;
		
		System.out.println("Kullan�c� Ad�n�z : ");
		username=input.nextLine();
		System.out.println("�ifreniz : ");
		password=input.nextLine();
		
		if(username.equals("patika")&& password.equals("java123"))
			System.out.println("Giri� Yapt�n�z! ");
		
		else
			{System.out.println("Bilgileriniz Yanl��!\n�ifrenizi s�f�rlamak istiyor musunuz?(evet i�in 1, hay�r i�in 0 giriniz): ");
			int yenile=input.nextInt();
			
			
			if(yenile==1)
			{
				Scanner in=new Scanner(System.in);
				System.out.println("Yeni �ifreniz:");
				String yeniPassword=in.nextLine();
			
				if(yeniPassword.equals("java123"))
					{System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");}
				
				else
					{System.out.println("�ifre olu�turuldu.");}
			in.close();
			}
			else if(yenile==0) {System.out.println("�ifre de�i�tirilmedi");}
			
			else {System.out.println("Hatal� giri� yapt�n�z.Tekrar deneyin!");}
			}
		}
	}

