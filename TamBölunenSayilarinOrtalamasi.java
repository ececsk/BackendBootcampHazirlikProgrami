import java.util.Scanner;
public class TamBölunenSayilarinOrtalamasi {

	public static void main(String[] args) {
		//Ödev: 
		//0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e tam bölünen sayýlarýn ortalamasýný hesaplayan program.
		//Program that calculates the average of numbers divisible by 3 and 4 from numbers from 0 to the number entered.
		
		Scanner input=new Scanner(System.in);
		int num,sum=0,count=0;
		double avg;
		
		System.out.println("Sayý Giriniz: ");
		num=input.nextInt();
		
		
		for(int i=1;i<=num;i++) //i=0 olduðu zaman 0 da dahil edildiði için sonuç yanlýþ oluyor.
		{
			if(i%3==0 && i%4==0)
			{   
				sum+=i; 
				count++;
				 				
				
			}
			
		}
		avg=sum/count;
		System.out.println(avg);
	}

}
