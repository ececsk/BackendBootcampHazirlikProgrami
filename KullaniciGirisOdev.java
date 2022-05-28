import java.util.Scanner;
public class KullaniciGirisOdev {

	public static void main(String[] args) {
		/*Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný sorun,
		 * eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , 
		 * þifreler ayný ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz." 
		 * sorun yoksa "Þifre oluþturuldu" yazan programý yazýnýz.*/
		
		Scanner input=new Scanner(System.in);
		
		String username,password;
		
		System.out.println("Kullanýcý Adýnýz : ");
		username=input.nextLine();
		System.out.println("Þifreniz : ");
		password=input.nextLine();
		
		if(username.equals("patika")&& password.equals("java123"))
			System.out.println("Giriþ Yaptýnýz! ");
		
		else
			{System.out.println("Bilgileriniz Yanlýþ!\nÞifrenizi sýfýrlamak istiyor musunuz?(evet için 1, hayýr için 0 giriniz): ");
			int yenile=input.nextInt();
			
			
			if(yenile==1)
			{
				Scanner in=new Scanner(System.in);
				System.out.println("Yeni Þifreniz:");
				String yeniPassword=in.nextLine();
			
				if(yeniPassword.equals("java123"))
					{System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");}
				
				else
					{System.out.println("Þifre oluþturuldu.");}
			in.close();
			}
			else if(yenile==0) {System.out.println("Þifre deðiþtirilmedi");}
			
			else {System.out.println("Hatalý giriþ yaptýnýz.Tekrar deneyin!");}
			}
		}
	}

