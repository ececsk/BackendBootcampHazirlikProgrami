import java.util.Scanner;
public class CiftSayiToplam {

	public static void main(String[] args) {
		// 0'dan girilen Sayýya Kadar Olan Çift Sayýlarý bulan program.
		//Program to find even numbers from 0 to the number entered.
		Scanner input=new Scanner(System.in);
		
	int num;
	System.out.println("Sayi Giriniz: ");
	num=input.nextInt();
	
	/* for(int i=0;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		
	}*/
	
	//while ile
	int i=0;
	while(i<=num)
	{
		if(i%2==0)
			{System.out.println(i);}
		i++;
	}

	}

}
