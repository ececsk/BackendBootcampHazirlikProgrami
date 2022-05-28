import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
	/*Ödev:Manav Kasa Programý
	
	Kullanýcýlarýn manavdan almýþ olduklarý ürünlerin kilogram deðerlerine göre toplam tutarýný ekrana yazdýran programý yazýn.
	Meyveler ve KG Fiyatlarý:
	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patlýcan : 5,00 TL
	*/
		Scanner input=new Scanner(System.in);
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;//kilogram fiyatý
		double armutKg,elmaKg,domatesKg,muzKg,patlicanKg; //alýnan (kg cinsinden) miktar
		
		System.out.println("Alýnan armut miktarýný kg cinsinden yazýnýz: ");
		armutKg=input.nextDouble();
		System.out.println("Alýnan elma miktarýný kg cinsinden yazýnýz: ");
		elmaKg=input.nextDouble();
		System.out.println("Alýnan domates miktarýný kg cinsinden yazýnýz: ");
		domatesKg=input.nextDouble();
		System.out.println("Alýnan muz miktarýný kg cinsinden yazýnýz: ");
		muzKg=input.nextDouble();
		System.out.println("Alýnan patlýcan miktarýný kg cinsinden yazýnýz: ");
		patlicanKg=input.nextDouble();
		
		double armutTutar=armutKg*armut;
		System.out.println("Armut için ödenecek Tutar: "+armutTutar+" TL");
		double elmaTutar=elmaKg*elma;
		System.out.println("Elma için ödenecek Tutar: "+elmaTutar+" TL");
		double domatesTutar=domatesKg*domates;
		System.out.println("Domates için ödenecek Tutar: "+domatesTutar+" TL");
		double muzTutar=muzKg*muz;
		System.out.println("Muz için ödenecek Tutar: "+muzTutar+" TL");
		double patlicanTutar=patlicanKg*patlican;
		System.out.println("Patlýcan için ödenecek Tutar: "+patlicanTutar+" TL");
		
		double toplamTutar=armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
		System.out.println("--------------\nTOPLAM TUTAR: "+toplamTutar+" TL");
		
		
	}

}
