import java.util.Scanner;

public class Odev4_5inKuvveti {

	public static void main(String[] args) {
		// D�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�r�n
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Sayi Giriniz: ");
		n = input.nextInt();
		
		System.out.println( n + " 'e kadar 4 ve 5'in Kuvvetleri:");
		
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0 && i % 5 == 0) {
				
				System.out.println(i);
			}
		}

	}

}
