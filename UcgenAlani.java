import java.util.Scanner;
public class UcgenAlani {

	public static void main(String[] args) {
		//�dev: �� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin �evresini ve alan�n� hesaplayan program
		Scanner input=new Scanner(System.in);
		double a,b,c;
		
		System.out.println("��genin kenar uzunluklar�n� girin: ");
		System.out.println("Birinci kenar: ");
		a=input.nextDouble();
		System.out.println("�kinci kenar: ");
		b=input.nextDouble();
		System.out.println("���nc� kenar: ");
		c=input.nextDouble();
		
		double u=(a+b+c)/2;
		
		double cevre=2*u;
		double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
				
		System.out.println("��genin �evresi: "+cevre);
		System.out.println("��genin Alan�: "+(alan));
	}

}
