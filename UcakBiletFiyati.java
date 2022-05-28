import java.util.Scanner;

public class UcakBiletFiyati {

	public static void main(String[] args) {
		/*
		 * �DEV U�ak Bileti Fiyat� Hesaplayan Program Java ile mesafeye ve �artlara g�re
		 * u�ak bileti fiyat� hesaplayan program� yap�n. Kullan�c�dan Mesafe (KM), ya��
		 * ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) bilgilerini al�n. Mesafe ba��na �cret
		 * 0,10 TL / km olarak al�n. �lk olarak u�u�un toplam fiyat�n� hesaplay�n ve
		 * sonras�nda ki ko�ullara g�re m��teriye a�a��daki indirimleri uygulay�n ;
		 * 
		 * Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�,
		 * yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya
		 * "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir. Ki�i 12 ya��ndan
		 * k���kse bilet fiyat� �zerinden %50 indirim uygulan�r. Ki�i 12-24 ya�lar�
		 * aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r. Ki�i 65 ya��ndan
		 * b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r. Ki�i
		 * "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim
		 * uygulan�r.
		 */
		Scanner input = new Scanner(System.in);

		int mesafe, yas, yolculukTipi; // yolculuk tipi 1 ise tek y�n, 2 ise Gidi�/D�n��
		double normalTutar, yasIndirimOrani = 0, indirimliTutar, yasIndirimi, gidisDonusBiletIndirimi, toplamTutar = 0;

		System.out.print("Yolculuk Tipinizi Se�iniz:(1-Tek Y�n 2-Gidi�/D�n��):");
		yolculukTipi = input.nextInt();
		System.out.print("Mesafeyi KM t�r�nden giriniz: ");
		mesafe = input.nextInt();
		System.out.print("Yolcunun Ya��: ");
		yas = input.nextInt();

		normalTutar = mesafe * 0.10;

		if (yas > 0 && mesafe > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

			if (yas < 12) {
				yasIndirimOrani = 0.50;
			} else if (yas >= 12 && yas <= 24) {
				yasIndirimOrani = 0.10;
			}

			else if (yas > 65) {
				yasIndirimOrani = 0.30;
			}

			yasIndirimi = normalTutar * yasIndirimOrani;
			indirimliTutar = normalTutar - yasIndirimi;
			toplamTutar = normalTutar - yasIndirimi;

			if (yolculukTipi == 2) {
				gidisDonusBiletIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;
			}

			System.out.println("Toplam Tutar: " + toplamTutar + " TL");
		} else {
			System.out.println("Hatal� Veri Girdiniz! Tekrar Deneyiniz.");
		}
	}
}
