import java.util.Scanner;
public class HavayagoreEtkinlik {

	public static void main(String[] args) {
		/*Hava S�cakl���na G�re Etkinlik �nerme
		Ko�ullu ifadeler ile hava s�cakl���na g�re etkinlik �neren program yap�m�.
		Ko�ullar :
		S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
		S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
		S�cakl�k 15 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
		S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.*/
		
		Scanner input=new Scanner(System.in);
		
		int heat;
		System.out.println("S�cakl� Giriniz: ");
		heat=input.nextInt();
		
		if(heat<5)
		{System.out.println("Kayak yapabilirsiniz.");}
		else if(heat>=5 && heat<=25) {
			if(heat<=15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat>=10) {
				System.out.println("Pikni�e gidebilirsiniz.");}
		}
		else {System.out.println("Y�zmeye gidebilirsiniz.");}
	
		
		}
		
		
		
	}

