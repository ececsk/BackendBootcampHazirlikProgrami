import java.util.Scanner;
public class SinifGecme {

	public static void main(String[] args) {
		/* S�n�f� Ge�me Durumu
		ko�ullu ifadeler ile kullan�c�n�n not durumuna g�re s�n�f� ge�me durumunu hesaplayan program yap�m�.
		Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
		Ge�me Notu : 55
		*/
		Scanner input=new Scanner(System.in);
		int mat,fizik,turkce,kimya,muzik;
		
		System.out.println("Matematik Notunuz: ");
		mat=input.nextInt();
		System.out.println("Fizik Notunuz: ");
		fizik=input.nextInt();
		System.out.println("T�rk�e Notunuz: ");
		turkce=input.nextInt();
		System.out.println("Kimya Notunuz: ");
		kimya=input.nextInt();
		System.out.println("M�zik Notunuz: ");
		muzik=input.nextInt();
		
		double average=(mat+fizik+turkce+kimya+muzik)/5;
		if(average>=55)
			System.out.println("Tebrikler. S�n�f� Ge�tiniz");
		else
			System.out.println("S�n�fta Kald�n�z");
		
		System.out.println("Ortalaman�z: "+average);
	}

}
