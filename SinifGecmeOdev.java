import java.util.Scanner;
public class SinifGecmeOdev {

	public static void main(String[] args) {
		// S�n�f� Ge�me Durumu 
		//E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya kat�lmas�n.
		Scanner input=new Scanner(System.in);
		int mat,fizik,turkce,kimya,muzik,toplam=0;
		double average;
		
		System.out.println("Matematik Notunuz: ");
		mat=input.nextInt();
		toplam=(mat>=0 && mat<=100)?(toplam+=mat):0;
		
		System.out.println("Fizik Notunuz: ");
		fizik=input.nextInt();
		toplam=(fizik>=0 && fizik<=100)?(toplam+=fizik):0;
		
		System.out.println("T�rk�e Notunuz: ");
		turkce=input.nextInt();
		toplam=(turkce>=0 && turkce<=100)?(toplam+=turkce):0;
		
		System.out.println("Kimya Notunuz: ");
		kimya=input.nextInt();
		toplam=(kimya>=0 && kimya<=100)?(toplam+=kimya):0;
		
		System.out.println("M�zik Notunuz: ");
		muzik=input.nextInt();
		toplam=(muzik>=0 && muzik<=100)?(toplam+=muzik):0;
		
		
	average=toplam/5;
			
			if(average>=55)
				System.out.println("Tebrikler. S�n�f� Ge�tiniz");
			else
				System.out.println("S�n�fta Kald�n�z");
			
	System.out.println("Ortalaman�z: "+average);
	
	}
	}
