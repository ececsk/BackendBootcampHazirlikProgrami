import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int typedPassword;
		boolean askPassword=true;
		
		do {
			System.out.print("�ifre Giriniz: ");
			typedPassword=scan.nextInt();
			if(typedPassword==1234) {
				System.out.println("�ifre Do�ru.");
				askPassword=false;
			}	
			else {System.out.println("Yanl�� �ifre! Tekrar Deneyin.\n");}
		}
		while(askPassword);

	}

}
