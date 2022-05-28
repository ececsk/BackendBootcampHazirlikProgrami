import java.util.Scanner;
public class NotOrtHesaplama {

	public static void main(String[] args) {
		//Not Ortalamasý Hesaplama (if else kullanmadan)
		
		int mat,fizik,turkce,kimya,tarih,muzik;
		double toplam,ortalama;
		Scanner inp=new Scanner(System.in);
		
		//sýnav puanlarýný kullanýcýdan alýyoruz
		
		System.out.println("Matematik Notunuz: ");
		mat=inp.nextInt();
		
		System.out.println("Fizik Notunuz: ");
		fizik=inp.nextInt();
		
		System.out.println("Türkçe Notunuz: ");
		turkce=inp.nextInt();
		
		System.out.println("Kimya Notunuz: ");
		kimya=inp.nextInt();
		
		System.out.println("Tarih Notunuz: ");
		tarih=inp.nextInt();
		
		System.out.println("Müzik Notunuz: ");
		muzik=inp.nextInt();
		
		toplam=mat+fizik+turkce+kimya+tarih+muzik;
		
		ortalama=toplam/6;
		
		System.out.println("Not Ortalamasý: "+ortalama);
		
		//Ödev: eðer kullanýcýnýn ortalamasý 60'dan büyük ise ekrana "Sýnýfý Geçti" , küçük ise "Sýnýfta Kaldý" yazdýrýn.
		
		System.out.println(ortalama>=60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");
		}

}
