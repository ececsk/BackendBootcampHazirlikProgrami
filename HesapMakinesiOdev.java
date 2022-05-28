import java.util.Scanner;
public class HesapMakinesiOdev {

	public static void main(String[] args) {
		// Ödev:switch-case kullanarak basit hesap makinesi yapýnýz.
		
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
		
		switch(select)
		{
		case 1:
			System.out.println("Toplam: "+(x+y));
			break;
		case 2:
			System.out.println("Çýkarma: "+(x-y));
			break;
		
		case 3:
			System.out.println("Çarpma: "+(x*y));
			break;
		case 4:
			System.out.println("Bölme: "+(x/y));
			break;
		default:
			System.out.println("Hatalý Seçim Yaptýnýz. Lütfen Tekrar Deneyiniz.");
			break;
		}
		}

}
