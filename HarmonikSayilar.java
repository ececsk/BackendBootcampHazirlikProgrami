import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		// Java ile girilen sayýnýn harmonik serisini bulan program
		// harmonik seri formülü: 1+(1/2)+(1/3)+(1/4)+(1/n)
		
		/* Amacýmýz serinin deðiþkeni olan bir n degiþkenini pozisyon alýp o deðiþkene kadar olan
		 harmonik seriyi hesaplayan programý yazmak*/

		Scanner input = new Scanner(System.in);

		System.out.println("N sayýsýný giriniz: ");

		double n = input.nextInt();
		double result = 0;

		for (double i = 1; i <= n; i++) {
			result += (1 / i);// (int i olarak)bu þekilde yazarsak n=2 için 1.0 deðerini döndürür çünkü burada
								// java int/int olduðu için sonucun int olmasýný bekliyor
			// eðer iyi double tanýmlarsak yukarýdaki kodumuzda da doðru sonucu alýrýz.
			// result+=(1.0/i);
		}
		// for döngüsü için:
		// 1.döngü i=1;result 0+(1/1)=1
		// 2.döngü i=2;result=1+(1/2)=1.5

		/*while (n > 0) {
			result += (1 / n);
			n--;
		}*/
		System.out.println(result);
	}

}
