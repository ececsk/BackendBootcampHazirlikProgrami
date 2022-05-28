import java.util.Scanner;
public class DaireDilimininAlani {

	public static void main(String[] args) {
		// Ödev: Yarýçapý r, merkez açýsýsýnýn ölçüsü a olan daire diliminin alaný 
		Scanner input=new Scanner(System.in);
		
		int r;
		double a, pi=3.14;
		
		System.out.println("Yarýçapý giriniz: ");
		r=input.nextInt();
		
		System.out.println("Merkez açýnýn ölçüsünü giriniz: ");
		a=input.nextDouble();
		
		double alan=(pi*(r*r)*a)/360;
		System.out.println("Daire Diliminin Alaný: "+alan);
	}

}
