import java.util.Scanner;

public class OdevYildiz {

	public static void main(String[] args) {
		// Java'da döngüler kullanarak yýldýzlar ile elmas yapýnýz.
		
	   /*       *
		*      ***
		*     *****
		*    *******
		*   *********
		*  ***********
		*   *********
		*    *******
		*     *****
		*      ***
		*       *
		*/       
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz: ");
		int n = input.nextInt(); 
		
		//artan kýsým
		for (int i = 1; i <= n; i++) { // satýrlarýmýzý elde ettiðimiz

			for (int j = 1; j <= (n - i); j++) // boþluk sayýsý
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)// yýldýz sayýsý için 1 den baslayýp ikiþer ikiþer arttýrabiliriz ya da 2j-1 yani 2*boþluk sayýsý-1 ile yýldýz sayýmýza ulaþabiliriz.
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//azalan kýsým
		 for(int x=1;x<=n;x++)
	        {
	            for (int y=1;y<=x;y++)
	            {
	                System.out.print(" ");
	            }
	            for (int z=((2*n)-1);z>=((2*x)+1);z--)
	            {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }
	    }
	

	
	}


