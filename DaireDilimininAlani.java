import java.util.Scanner;
public class DaireDilimininAlani {

	public static void main(String[] args) {
		// �dev: Yar��ap� r, merkez a��s�s�n�n �l��s� a olan daire diliminin alan� 
		Scanner input=new Scanner(System.in);
		
		int r;
		double a, pi=3.14;
		
		System.out.println("Yar��ap� giriniz: ");
		r=input.nextInt();
		
		System.out.println("Merkez a��n�n �l��s�n� giriniz: ");
		a=input.nextDouble();
		
		double alan=(pi*(r*r)*a)/360;
		System.out.println("Daire Diliminin Alan�: "+alan);
	}

}
