import java.util.Scanner;
public class HesapMakinesiOdev {

	public static void main(String[] args) {
		// �dev:switch-case kullanarak basit hesap makinesi yap�n�z.
		
		Scanner input=new Scanner(System.in);
		int x,y,select;
		System.out.println("Birinci Say�y� Giriniz: ");
		x=input.nextInt();
		System.out.println("�kinci Say�y� Giriniz: ");
		y=input.nextInt();
		System.out.println("\nYapmak istedi�iniz i�lemin numaras�n� giriniz");
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n");
		System.out.println("Se�iminiz: ");
		select=input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("Toplam: "+(x+y));
			break;
		case 2:
			System.out.println("��karma: "+(x-y));
			break;
		
		case 3:
			System.out.println("�arpma: "+(x*y));
			break;
		case 4:
			System.out.println("B�lme: "+(x/y));
			break;
		default:
			System.out.println("Hatal� Se�im Yapt�n�z. L�tfen Tekrar Deneyiniz.");
			break;
		}
		}

}
