import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		//Koþullu ifadeler ile basit hesap makinesi yapýmý.
		Scanner input=new Scanner(System.in);
		int x,y,select;
		
		System.out.println("Birinci Sayýyý Giriniz: ");
		x=input.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz: ");
		y=input.nextInt();
		System.out.println("\nYapmak istediðiniz iþlemin numarasýný giriniz");
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n");
		System.out.println("Seçiminiz: ");
		select=input.nextInt();
		
		if(select==1) 
			{System.out.println("Toplam: "+(x+y));}
		else if (select==2)
			{System.out.println("Çýkarma: "+(x-y));}
		else if(select==3)
			{System.out.println("Çarpma: "+(x*y));}
		else if(select==4)
			{if(y!=0) {System.out.println("Bölme: "+(x/y));}
			else {System.out.println("Bir sayý sýfýra bölünmez.");}}
		else
			{System.out.println("Yanlýþ Seçim Yaptýnýz. Tekrar Deneyiniz.");}
		}


	}


