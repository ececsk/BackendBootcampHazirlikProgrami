import java.util.Scanner;
public class TamB�lunenSayilarinOrtalamasi {

	public static void main(String[] args) {
		//�dev: 
		//0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam b�l�nen say�lar�n ortalamas�n� hesaplayan program.
		//Program that calculates the average of numbers divisible by 3 and 4 from numbers from 0 to the number entered.
		
		Scanner input=new Scanner(System.in);
		int num,sum=0,count=0;
		double avg;
		
		System.out.println("Say� Giriniz: ");
		num=input.nextInt();
		
		
		for(int i=1;i<=num;i++) //i=0 oldu�u zaman 0 da dahil edildi�i i�in sonu� yanl�� oluyor.
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
