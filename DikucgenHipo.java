import java.util.Scanner;
public class DikucgenHipo {

	public static void main(String[] args) {
		//Kullanıcıdan dik kenarlarının uzunluğunu alarak hipotenüsü hesaplayan program.

		int a,b;
		double hipotenus;
		Scanner input=new Scanner(System.in);
		System.out.println("Dik kenar uzunluklarını giriniz: ");
		System.out.println("Birinci dik kenar: ");
		a=input.nextInt();
		System.out.println("İkinci dik kenar: ");
		b=input.nextInt();
		
		hipotenus=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs: "+hipotenus);

	}

}
