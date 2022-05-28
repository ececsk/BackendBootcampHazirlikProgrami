import java.util.Scanner;
public class TekSayilarinToplami {

	public static void main(String[] args) {
		//Negatif bir deðer girilene kadar kullanýcýdan giriþleri kabul eden ve girilen deðerlerden tek sayýlarý toplayýp ekrana basan program.
		
		Scanner input=new Scanner(System.in);
		
		int n,sum=0;
		
		do {
			System.out.println("Sayi Giriniz: ");
			n=input.nextInt();
			if(n%2==1) //Sayýnýn 2'ye bölümden kalan 1 ise o sayý tek sayýdýr.
			{
				sum+=n; //sum=sum+n;
			}
		}
		while(n>0);
		System.out.println("Toplam: "+sum);
	}

}
