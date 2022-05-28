import java.util.Scanner;
public class UcgenAlani {

	public static void main(String[] args) {
		//Ödev: Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin çevresini ve alanýný hesaplayan program
		Scanner input=new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Üçgenin kenar uzunluklarýný girin: ");
		System.out.println("Birinci kenar: ");
		a=input.nextDouble();
		System.out.println("Ýkinci kenar: ");
		b=input.nextDouble();
		System.out.println("Üçüncü kenar: ");
		c=input.nextDouble();
		
		double u=(a+b+c)/2;
		
		double cevre=2*u;
		double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
				
		System.out.println("Üçgenin Çevresi: "+cevre);
		System.out.println("Üçgenin Alaný: "+(alan));
	}

}
