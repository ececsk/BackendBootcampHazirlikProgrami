import java.util.Scanner;
public class DaireAlani {

	public static void main(String[] args) {
		/*Dairenin Alan�n� ve �evresini Hesaplayan Program
		  Yar� �ap�n� kullan�c� taraf�ndan girilen dairenin alan�n� ve �evresini hesaplayan program� yaz�n.
		 */
		Scanner input=new Scanner(System.in);
		double pi=3.14;
		int r;
	
		System.out.println("Yar��ap� giriniz: ");
		r=input.nextInt();
		
		double cevre=2*pi*r;
		double alan=pi*r*r;
		
		System.out.println("Dairenin �evresi: "+cevre);
		System.out.println("Dairenin Alan�: "+alan);
		
	}

}
