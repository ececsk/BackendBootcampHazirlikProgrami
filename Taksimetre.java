import java.util.Scanner;
public class Taksimetre {

	public static void main(String[] args) {
		/* �dev: Taksimetre Program�
		 Gidilen mesafeye (KM) g�re taksimetre tutar�n� ekrana yazd�ran program� yaz�n.
		-Taksimetre km ba��na 2.20 tutmaktad�r.
		-Minimum �denecek tutar 20 TL'dir. (20TL alt�ndaki �cretlerde de 20 TL al�n�r.)
		-Taksimetre a��l�� �creti 10 TL'dir.
		*/
		Scanner input= new Scanner(System.in);
		
		int km;
		double perKm=2.20,total,startPrice=10;
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		km=input.nextInt();
	
		total=(km*perKm);
		total+=startPrice; //total=total+startPrice
		
		total=(total<20) ? 20 : total; //Minimum �denecek tutar 20 TL olmal�
		System.out.println("Toplam Tutar: "+total);

	}

}
