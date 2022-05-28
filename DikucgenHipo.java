import java.util.Scanner;
public class DikucgenHipo {

	public static void main(String[] args) {
		//Kullanýcýdan dik kenarlarýnýn uzunluðunu alarak hipotenüsü hesaplayan program.

		int a,b;
		double hipotenus;
		Scanner input=new Scanner(System.in);
		System.out.println("Dik kenar uzunluklarýný giriniz: ");
		System.out.println("Birinci dik kenar: ");
		a=input.nextInt();
		System.out.println("Ýkinci dik kenar: ");
		b=input.nextInt();
		
		hipotenus=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs: "+hipotenus);

	}

}
