import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int typedPassword;
		boolean askPassword=true;
		
		do {
			System.out.print("Þifre Giriniz: ");
			typedPassword=scan.nextInt();
			if(typedPassword==1234) {
				System.out.println("Þifre Doðru.");
				askPassword=false;
			}	
			else {System.out.println("Yanlýþ Þifre! Tekrar Deneyin.\n");}
		}
		while(askPassword);

	}

}
