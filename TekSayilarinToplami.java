import java.util.Scanner;
public class TekSayilarinToplami {

	public static void main(String[] args) {
		//Negatif bir de�er girilene kadar kullan�c�dan giri�leri kabul eden ve girilen de�erlerden tek say�lar� toplay�p ekrana basan program.
		
		Scanner input=new Scanner(System.in);
		
		int n,sum=0;
		
		do {
			System.out.println("Sayi Giriniz: ");
			n=input.nextInt();
			if(n%2==1) //Say�n�n 2'ye b�l�mden kalan 1 ise o say� tek say�d�r.
			{
				sum+=n; //sum=sum+n;
			}
		}
		while(n>0);
		System.out.println("Toplam: "+sum);
	}

}
