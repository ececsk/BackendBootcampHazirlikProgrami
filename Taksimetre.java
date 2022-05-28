import java.util.Scanner;
public class Taksimetre {

	public static void main(String[] args) {
		/* Ödev: Taksimetre Programý
		 Gidilen mesafeye (KM) göre taksimetre tutarýný ekrana yazdýran programý yazýn.
		-Taksimetre km baþýna 2.20 tutmaktadýr.
		-Minimum ödenecek tutar 20 TL'dir. (20TL altýndaki ücretlerde de 20 TL alýnýr.)
		-Taksimetre açýlýþ ücreti 10 TL'dir.
		*/
		Scanner input= new Scanner(System.in);
		
		int km;
		double perKm=2.20,total,startPrice=10;
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		km=input.nextInt();
	
		total=(km*perKm);
		total+=startPrice; //total=total+startPrice
		
		total=(total<20) ? 20 : total; //Minimum ödenecek tutar 20 TL olmalý
		System.out.println("Toplam Tutar: "+total);

	}

}
