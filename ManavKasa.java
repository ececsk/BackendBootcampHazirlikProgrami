import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
	/*�dev:Manav Kasa Program�
	
	Kullan�c�lar�n manavdan alm�� olduklar� �r�nlerin kilogram de�erlerine g�re toplam tutar�n� ekrana yazd�ran program� yaz�n.
	Meyveler ve KG Fiyatlar�:
	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patl�can : 5,00 TL
	*/
		Scanner input=new Scanner(System.in);
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;//kilogram fiyat�
		double armutKg,elmaKg,domatesKg,muzKg,patlicanKg; //al�nan (kg cinsinden) miktar
		
		System.out.println("Al�nan armut miktar�n� kg cinsinden yaz�n�z: ");
		armutKg=input.nextDouble();
		System.out.println("Al�nan elma miktar�n� kg cinsinden yaz�n�z: ");
		elmaKg=input.nextDouble();
		System.out.println("Al�nan domates miktar�n� kg cinsinden yaz�n�z: ");
		domatesKg=input.nextDouble();
		System.out.println("Al�nan muz miktar�n� kg cinsinden yaz�n�z: ");
		muzKg=input.nextDouble();
		System.out.println("Al�nan patl�can miktar�n� kg cinsinden yaz�n�z: ");
		patlicanKg=input.nextDouble();
		
		double armutTutar=armutKg*armut;
		System.out.println("Armut i�in �denecek Tutar: "+armutTutar+" TL");
		double elmaTutar=elmaKg*elma;
		System.out.println("Elma i�in �denecek Tutar: "+elmaTutar+" TL");
		double domatesTutar=domatesKg*domates;
		System.out.println("Domates i�in �denecek Tutar: "+domatesTutar+" TL");
		double muzTutar=muzKg*muz;
		System.out.println("Muz i�in �denecek Tutar: "+muzTutar+" TL");
		double patlicanTutar=patlicanKg*patlican;
		System.out.println("Patl�can i�in �denecek Tutar: "+patlicanTutar+" TL");
		
		double toplamTutar=armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
		System.out.println("--------------\nTOPLAM TUTAR: "+toplamTutar+" TL");
		
		
	}

}
