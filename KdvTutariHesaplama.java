import java.util.Scanner;
public class KdvTutariHesaplama {

	public static void main(String[] args) {
		// Ödev: KDV Tutarı Hesaplama
		// Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Ücret Tutarını giriniz: ");
		double tutar=input.nextDouble();
		
		double kdvOrani=(tutar>0 && tutar<=1000) ? 0.18 : 0.8; //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplanacak.

		
		double kdvTutari=tutar*kdvOrani;
		double kdvliTutar=tutar+(kdvTutari);
		
		System.out.println("KDV Orani: "+ kdvOrani);
		System.out.println("KDV'siz tutar: "+ tutar);
		System.out.println("KDV Tutarı: "+ kdvTutari);
		System.out.println("KDV'li Tutar: "+kdvliTutar);
	}

}
