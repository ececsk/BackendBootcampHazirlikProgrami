import java.util.Scanner;
public class Faktoriyel {

	public static void main(String[] args) {
		//Fakt�riyel Hesaplayan Program
		Scanner input = new Scanner(System.in);
		 int sum=1; 
		System.out.print("Say� Giriniz: ");
		int n=input.nextInt();
		
		/* for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		} */
		
		//while ile
		while(n>0)
		{
			sum=sum*n;
			n--;
		}
		
		System.out.println("Girilen Say�n�n Fakt�riyeli: "+sum);
	}

}
