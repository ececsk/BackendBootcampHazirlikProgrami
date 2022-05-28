import java.util.Scanner;

public class KucuktenBuyugeSiralama {

	public static void main(String[] args) {
		// Ödev: Girilen 3 sayýyý "küçükten büyüðe" sýralayan programý yazýnýz.

		Scanner input=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Birinci sayý: ");
		a=input.nextInt();
		System.out.println("Ýkinci sayý: ");
		b=input.nextInt();
		System.out.println("Üçüncü sayý: ");
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
		else System.out.println("Lütfen birbirine eþit deðerler girmeyin");

	}



}
