import java.util.Scanner; 
public class BuyuktenKucugeSiralama {
		
		public static void main(String[] args) {
			/*Say�lar� B�y�kten K����e S�ralayan Program
			Ko�ullu ifadeler ile girilen 3 say�y� b�y�kten k����e s�ralayan program */
			
			Scanner input=new Scanner(System.in);
			int a,b,c;
			
			System.out.println("Birinci say�: ");
			a=input.nextInt();
			System.out.println("�kinci say�: ");
			b=input.nextInt();
			System.out.println("���nc� say�: ");
			c=input.nextInt();
			
			if(a>b && a>c) {
				if(b>c) {System.out.println(a+">"+b+">"+c);}
				else {System.out.println(a+">"+c+">"+b);}
			}
			
			else if(b>a && b>c){
				if(a>c) {System.out.println(b+">"+a+">"+c);}
				else {System.out.println(b+">"+c+">"+a);}
			}
			else if (c>a && c>b){
				if(a>b) {System.out.println(c+">"+a+">"+b);}
				else {System.out.println(c+">"+b+">"+a);}	
			}
			else System.out.println("L�tfen birbirine e�it de�erler girmeyin");

		}

	}


