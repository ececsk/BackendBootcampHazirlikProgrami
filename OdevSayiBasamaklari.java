import java.util.Scanner;

public class OdevSayiBasamaklari {

	public static void main(String[] args) {
		// Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.
		// Örnek : 1643 = 1 + 6 + 4 + 3 = 1
		

		Scanner input = new Scanner(System.in);
		System.out.println("Sayý Giriniz: ");
		int number=input.nextInt();
		int sum=0,basamakSayisi=0,basamakDegeri=0,tempNum=number;
		
		while (tempNum != 0) {
			tempNum /= 10;
			basamakSayisi++;
		}
		tempNum=number;
		
		while(tempNum!=0) 
		{
			basamakDegeri=tempNum%10;
			sum=sum+basamakDegeri;
			tempNum=tempNum/10;
		}
		
		System.out.println("Basamak Sayisi: "+basamakSayisi);
		System.out.println("Basamaklar Toplamý:"+sum);
		
			
	}
}
