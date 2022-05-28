import java.util.Scanner;
public class KdvTutariHesaplama {

	public static void main(String[] args) {
		// �dev: KDV Tutar� Hesaplama
		// Kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� ve KDV tutar�n� hesaplay�p ekrana bast�ran program
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("�cret Tutar�n� giriniz: ");
		double tutar=input.nextDouble();
		
		double kdvOrani=(tutar>0 && tutar<=1000) ? 0.18 : 0.8; //E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplanacak.

		
		double kdvTutari=tutar*kdvOrani;
		double kdvliTutar=tutar+(kdvTutari);
		
		System.out.println("KDV Orani: "+ kdvOrani);
		System.out.println("KDV'siz tutar: "+ tutar);
		System.out.println("KDV Tutar�: "+ kdvTutari);
		System.out.println("KDV'li Tutar: "+kdvliTutar);
	}

}
