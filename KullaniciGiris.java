import java.util.Scanner;
public class KullaniciGiris {

	public static void main(String[] args) {
		// Ko�ullu ifadeler ile kullan�c� ad� ve �ifreyi kontrol eden program yap�m�
		Scanner input=new Scanner(System.in);
		
		String username,password;
		
		System.out.println("Kullan�c� Ad�n�z : ");
		username=input.nextLine();
		System.out.println("�ifreniz : ");
		password=input.nextLine();
		
		//karakterlerde bir �eye e�it olup olmad���n� sorgulad���m�z y�ntem farkl�d�r.
		if(username.equals("patika")&& password.equals("java123"))
			System.out.println("Giri� Yapt�n�z! ");
		else
			System.out.println("Bilgileriniz Yanl��!");
	}

}
