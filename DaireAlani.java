import java.util.Scanner;
public class DaireAlani {

	public static void main(String[] args) {
		/*Dairenin Alanýný ve Çevresini Hesaplayan Program
		  Yarý çapýný kullanýcý tarafýndan girilen dairenin alanýný ve çevresini hesaplayan programý yazýn.
		 */
		Scanner input=new Scanner(System.in);
		double pi=3.14;
		int r;
	
		System.out.println("Yarýçapý giriniz: ");
		r=input.nextInt();
		
		double cevre=2*pi*r;
		double alan=pi*r*r;
		
		System.out.println("Dairenin Çevresi: "+cevre);
		System.out.println("Dairenin Alaný: "+alan);
		
	}

}
