import java.util.Scanner;
public class WhileDongusu3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String customerPassword = "12345";
		boolean passwordSuccessfull = false;

		while(!passwordSuccessfull) {
			
			System.out.println("Hesap �ifrenizi giriniz:");
			String typedPassword = scanner.next();
			
		    if(customerPassword.contentEquals(typedPassword)) {
				passwordSuccessfull = true;
				System.out.println("Sisteme ba�ar�l� giri� yapt�n�z!");
			}
		    else
		    	{System.out.println("�ifreniz e�le�miyor. Tekrar deneyin.\n  ");}
		}
	}}
