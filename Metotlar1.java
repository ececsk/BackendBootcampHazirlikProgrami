
public class Metotlar1 {
//Metotlar (Fonksiyonlar)
	public static void main(String[] args) {
//�s alma �rne�ini metotlara uyarlayal�m.
	/*	
	    int base = 2, exp = 3, result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println(result);
		// her bir i�lem i�in yine ayn� kodlar� tekrar tekrar yazmam�z gerekecek
		base = 4;
		exp = 2;
		result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println(result);
*/
		
		//power metodunu �a��rma
		System.out.println(power(2,3));
		
		int case1=power(2,3);
		System.out.println(case1);
		
		helloWorld();
	}
	
	static int power(int base,int exp)
	{
		int result=1;
		for(int i=1;i<=exp;i++)
		{
			result*=base;
		}
		return result;
	}
	
	static void helloWorld()
	{
		System.out.println("Hello World!");
	}

}
