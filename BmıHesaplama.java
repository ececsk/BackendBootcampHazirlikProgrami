import java.util.Scanner;
public class Bm�Hesaplama {

	public static void main(String[] args) {
		/* V�cut Kitle �ndeksi(Body Mass Index) Hesaplama
		�dev: Kullan�c�dan boy ve kilo de�erlerini al�p bir de�i�kene atay�n. A�a��daki form�le g�re kullan�c�n�n "V�cut Kitle �ndeks" de�erini hesaplay�p ekrana yazd�r�n.
		Form�l:Kilo (kg) / Boy(m) * Boy(m)
		*/
		Scanner input=new Scanner(System.in);
		double boy,kilo,bmi;
		
		System.out.println("L�tfen boyunuzu metre(m) cinsinden giriniz: ");
		boy=input.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz(kg): ");
		kilo=input.nextDouble();
		
		bmi=kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksi: "+bmi);

	}

}
