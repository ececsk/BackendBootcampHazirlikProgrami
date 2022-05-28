
public class WhileDongusu {

	public static void main(String[] args) {
		//While Döngüsü
		int i=1;
		int k;
		
		System.out.println("Program Baþladý.");
		
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
