import java.util.Scanner;
public class DikucgenHipo {

	public static void main(String[] args) {
		//Kullan�c�dan dik kenarlar�n�n uzunlu�unu alarak hipoten�s� hesaplayan program.

		int a,b;
		double hipotenus;
		Scanner input=new Scanner(System.in);
		System.out.println("Dik kenar uzunluklar�n� giriniz: ");
		System.out.println("Birinci dik kenar: ");
		a=input.nextInt();
		System.out.println("�kinci dik kenar: ");
		b=input.nextInt();
		
		hipotenus=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipoten�s: "+hipotenus);

	}

}
