import java.util.Scanner;

public class KucuktenBuyugeSiralama {

	public static void main(String[] args) {
		// �dev: Girilen 3 say�y� "k���kten b�y��e" s�ralayan program� yaz�n�z.

		Scanner input=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Birinci say�: ");
		a=input.nextInt();
		System.out.println("�kinci say�: ");
		b=input.nextInt();
		System.out.println("���nc� say�: ");
		c=input.nextInt();
		
		if(a<b && a<c) {
			if(b>c) {System.out.println(a+"<"+c+"<"+b);}
			else {System.out.println(a+"<"+b+"<"+c);}
		}
		
		else if(b<a && b<c){
			if(a>c) {System.out.println(b+"<"+c+"<"+a);}
			else {System.out.println(b+"<"+a+"<"+c);}
		}
		else if (c<a && c<b){
			if(a>b) {System.out.println(c+"<"+b+"<"+a);}
			else {System.out.println(c+"<"+a+"<"+b);}	
		}
		else System.out.println("L�tfen birbirine e�it de�erler girmeyin");

	}



}
