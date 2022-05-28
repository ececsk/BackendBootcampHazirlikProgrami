import java.util.Scanner;
public class KullaniciGiris {

	public static void main(String[] args) {
		// Koþullu ifadeler ile kullanýcý adý ve þifreyi kontrol eden program yapýmý
		Scanner input=new Scanner(System.in);
		
		String username,password;
		
		System.out.println("Kullanýcý Adýnýz : ");
		username=input.nextLine();
		System.out.println("Þifreniz : ");
		password=input.nextLine();
		
		//karakterlerde bir þeye eþit olup olmadýðýný sorguladýðýmýz yöntem farklýdýr.
		if(username.equals("patika")&& password.equals("java123"))
			System.out.println("Giriþ Yaptýnýz! ");
		else
			System.out.println("Bilgileriniz Yanlýþ!");
	}

}
