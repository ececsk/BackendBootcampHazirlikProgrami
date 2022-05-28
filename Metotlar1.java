
public class Metotlar1 {
//Metotlar (Fonksiyonlar)
	public static void main(String[] args) {
//üs alma örneðini metotlara uyarlayalým.
	/*	
	    int base = 2, exp = 3, result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println(result);
		// her bir iþlem için yine ayný kodlarý tekrar tekrar yazmamýz gerekecek
		base = 4;
		exp = 2;
		result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println(result);
*/
		
		//power metodunu çaðýrma
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
