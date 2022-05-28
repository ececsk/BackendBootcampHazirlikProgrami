import java.util.Scanner;
public class HavayagoreEtkinlik {

	public static void main(String[] args) {
		/*Hava Sýcaklýðýna Göre Etkinlik Önerme
		Koþullu ifadeler ile hava sýcaklýðýna göre etkinlik öneren program yapýmý.
		Koþullar :
		Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner.
		Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner.
		Sýcaklýk 15 ve 25 arasýnda ise "Piknik" etkinliðini öner.
		Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.*/
		
		Scanner input=new Scanner(System.in);
		
		int heat;
		System.out.println("Sýcaklý Giriniz: ");
		heat=input.nextInt();
		
		if(heat<5)
		{System.out.println("Kayak yapabilirsiniz.");}
		else if(heat>=5 && heat<=25) {
			if(heat<=15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat>=10) {
				System.out.println("Pikniðe gidebilirsiniz.");}
		}
		else {System.out.println("Yüzmeye gidebilirsiniz.");}
	
		
		}
		
		
		
	}

