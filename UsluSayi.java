import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		// Kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program

		Scanner input = new Scanner(System.in);

		int a, n;

		System.out.print("�ss� al�nacak say�: ");
		a = input.nextInt();
		System.out.print("�s de�eri:");
		n = input.nextInt();

		/*
		 * int i=1, total=1;
		 * 
		 * while(i<=n) { total=total*a; //total*=a; i++; }
		 */
		// �dev For ile yap�m�

		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * a;
		}

		System.out.println("Sonu�: " + total);

	}

}
