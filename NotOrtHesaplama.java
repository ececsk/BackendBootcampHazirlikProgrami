import java.util.Scanner;
public class NotOrtHesaplama {

	public static void main(String[] args) {
		//Not Ortalamas� Hesaplama (if else kullanmadan)
		
		int mat,fizik,turkce,kimya,tarih,muzik;
		double toplam,ortalama;
		Scanner inp=new Scanner(System.in);
		
		//s�nav puanlar�n� kullan�c�dan al�yoruz
		
		System.out.println("Matematik Notunuz: ");
		mat=inp.nextInt();
		
		System.out.println("Fizik Notunuz: ");
		fizik=inp.nextInt();
		
		System.out.println("T�rk�e Notunuz: ");
		turkce=inp.nextInt();
		
		System.out.println("Kimya Notunuz: ");
		kimya=inp.nextInt();
		
		System.out.println("Tarih Notunuz: ");
		tarih=inp.nextInt();
		
		System.out.println("M�zik Notunuz: ");
		muzik=inp.nextInt();
		
		toplam=mat+fizik+turkce+kimya+tarih+muzik;
		
		ortalama=toplam/6;
		
		System.out.println("Not Ortalamas�: "+ortalama);
		
		//�dev: e�er kullan�c�n�n ortalamas� 60'dan b�y�k ise ekrana "S�n�f� Ge�ti" , k���k ise "S�n�fta Kald�" yazd�r�n.
		
		System.out.println(ortalama>=60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�");
		}

}
