import java.util.Scanner;

public class UcakBiletFiyati {

	public static void main(String[] args) {
		/*
		 * ÖDEV Uçak Bileti Fiyatý Hesaplayan Program Java ile mesafeye ve þartlara göre
		 * uçak bileti fiyatý hesaplayan programý yapýn. Kullanýcýdan Mesafe (KM), yaþý
		 * ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ) bilgilerini alýn. Mesafe baþýna ücret
		 * 0,10 TL / km olarak alýn. Ýlk olarak uçuþun toplam fiyatýný hesaplayýn ve
		 * sonrasýnda ki koþullara göre müþteriye aþaðýdaki indirimleri uygulayýn ;
		 * 
		 * Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý,
		 * yolculuk tipi ise 1 veya 2) olmalýdýr. Aksi takdirde kullanýcýya
		 * "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir. Kiþi 12 yaþýndan
		 * küçükse bilet fiyatý üzerinden %50 indirim uygulanýr. Kiþi 12-24 yaþlarý
		 * arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr. Kiþi 65 yaþýndan
		 * büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr. Kiþi
		 * "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim
		 * uygulanýr.
		 */
		Scanner input = new Scanner(System.in);

		int mesafe, yas, yolculukTipi; // yolculuk tipi 1 ise tek yön, 2 ise Gidiþ/Dönüþ
		double normalTutar, yasIndirimOrani = 0, indirimliTutar, yasIndirimi, gidisDonusBiletIndirimi, toplamTutar = 0;

		System.out.print("Yolculuk Tipinizi Seçiniz:(1-Tek Yön 2-Gidiþ/Dönüþ):");
		yolculukTipi = input.nextInt();
		System.out.print("Mesafeyi KM türünden giriniz: ");
		mesafe = input.nextInt();
		System.out.print("Yolcunun Yaþý: ");
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
			System.out.println("Hatalý Veri Girdiniz! Tekrar Deneyiniz.");
		}
	}
}
