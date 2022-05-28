import java.util.Scanner;

public class OdevYildiz {

	public static void main(String[] args) {
		// Java'da d�ng�ler kullanarak y�ld�zlar ile elmas yap�n�z.
		
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
		System.out.println("Bir Say� Giriniz: ");
		int n = input.nextInt(); 
		
		//artan k�s�m
		for (int i = 1; i <= n; i++) { // sat�rlar�m�z� elde etti�imiz

			for (int j = 1; j <= (n - i); j++) // bo�luk say�s�
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++)// y�ld�z say�s� i�in 1 den baslay�p iki�er iki�er artt�rabiliriz ya da 2j-1 yani 2*bo�luk say�s�-1 ile y�ld�z say�m�za ula�abiliriz.
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//azalan k�s�m
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


