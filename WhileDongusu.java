
public class WhileDongusu {

	public static void main(String[] args) {
		//While D�ng�s�
		int i=1;
		int k;
		
		System.out.println("Program Ba�lad�.");
		
		while(i<=5)
		{
			System.out.println(i+ " ");
			
			k=1;
			while(k<=10)
			{
				System.out.print(k+",");
				k++;
			}
			System.out.println();
			i++; //i=i+1; 
		}
		System.out.println("Program bitti.");
	}

}
