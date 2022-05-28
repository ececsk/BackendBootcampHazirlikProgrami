import java.util.Scanner;
public class BmýHesaplama {

	public static void main(String[] args) {
		/* Vücut Kitle Ýndeksi(Body Mass Index) Hesaplama
		Ödev: Kullanýcýdan boy ve kilo deðerlerini alýp bir deðiþkene atayýn. Aþaðýdaki formüle göre kullanýcýnýn "Vücut Kitle Ýndeks" deðerini hesaplayýp ekrana yazdýrýn.
		Formül:Kilo (kg) / Boy(m) * Boy(m)
		*/
		Scanner input=new Scanner(System.in);
		double boy,kilo,bmi;
		
		System.out.println("Lütfen boyunuzu metre(m) cinsinden giriniz: ");
		boy=input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz(kg): ");
		kilo=input.nextDouble();
		
		bmi=kilo/(boy*boy);
		System.out.println("Vücut Kitle Ýndeksi: "+bmi);

	}

}
