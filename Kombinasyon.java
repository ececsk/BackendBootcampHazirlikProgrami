import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// Ödev: Kombinasyon hesaplayan program yazýnýz.
		
		// C(n,r) = n! / (r! * (n-r)!)
		
		Scanner input = new Scanner(System.in);
		int n, factorialN = 1, r, factorialR = 1, fark, factorialN_R = 1;
		int combination;
		System.out.print("C(n,r) formatý için n ve r sayýlarý için\n n= ");
		n = input.nextInt();
		System.out.print(" r= ");
		r = input.nextInt();

		fark = n - r;

		for (int i = 1; i <= n; i++)// n!
		{
			factorialN = factorialN * i;
		}

		for (int j = 1; j <= r; j++)// r!
		{
			factorialR = factorialR * j;
		}
		for (int k = 1; k <= fark; k++)// (n-r)!
		{
			factorialN_R = factorialN_R * k;
		}
		int carpim = factorialR * factorialN_R;

		combination = factorialN / carpim;

		System.out.println("Kombinasyon=" + combination);
	}

}