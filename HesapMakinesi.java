import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		//Ko�ullu ifadeler ile basit hesap makinesi yap�m�.
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
		
		if(select==1) 
			{System.out.println("Toplam: "+(x+y));}
		else if (select==2)
			{System.out.println("��karma: "+(x-y));}
		else if(select==3)
			{System.out.println("�arpma: "+(x*y));}
		else if(select==4)
			{if(y!=0) {System.out.println("B�lme: "+(x/y));}
			else {System.out.println("Bir say� s�f�ra b�l�nmez.");}}
		else
			{System.out.println("Yanl�� Se�im Yapt�n�z. Tekrar Deneyiniz.");}
		}


	}


