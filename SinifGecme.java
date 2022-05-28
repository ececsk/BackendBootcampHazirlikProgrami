import java.util.Scanner;
public class SinifGecme {

	public static void main(String[] args) {
		/* Sýnýfý Geçme Durumu
		koþullu ifadeler ile kullanýcýnýn not durumuna göre sýnýfý geçme durumunu hesaplayan program yapýmý.
		Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		Geçme Notu : 55
		*/
		Scanner input=new Scanner(System.in);
		int mat,fizik,turkce,kimya,muzik;
		
		System.out.println("Matematik Notunuz: ");
		mat=input.nextInt();
		System.out.println("Fizik Notunuz: ");
		fizik=input.nextInt();
		System.out.println("Türkçe Notunuz: ");
		turkce=input.nextInt();
		System.out.println("Kimya Notunuz: ");
		kimya=input.nextInt();
		System.out.println("Müzik Notunuz: ");
		muzik=input.nextInt();
		
		double average=(mat+fizik+turkce+kimya+muzik)/5;
		if(average>=55)
			System.out.println("Tebrikler. Sýnýfý Geçtiniz");
		else
			System.out.println("Sýnýfta Kaldýnýz");
		
		System.out.println("Ortalamanýz: "+average);
	}

}
