
public class RecursiveMetot {
	// Recursive (Özyineli) Metotlar
	// Bir metotun kendi içinde kendisini tekrar çaðýrma iþlemidir. Genellikle deðer
	// döndüren metotlarda kullanýlýr ve genellikle void metotlarda iþe yaramaz

/*	
	static void print(){
	System.out.println("Hello World!");
	}
	
	static int f(int n)
	{
		int result=0;
		for(int i=1;i<=n;i++)
		{
			result+=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
	    //print();
		System.out.println(f(3));
		//f(1)=1
		//f(2)=1+2
		//f(3)=1+2+3
		//f(4)=1+2+3+4
		//f(n)=f(n-1)+n
		
		//Þimdi bunu fonksiyonlar üzerinden nasýl yapabildiðimize bakalým.Burada recursive metotlar devreye giriyor.

	}*/
	
	/*static int r(int n) { 
		System.out.println(n);
		//return r(n-1)+n;// bu þekilde yazdýðýmýzda infinity loopa giriyor ve en sonunda hafýzanýn dolduðu hatasýný alýyoruz o yüzden 1 olduðunda bitirmek istiyoruz
	 }*/
	
	static int f(int n)
	{
		System.out.println("n= "+n);
		if(n==1)
		{return 1;}
		
		int result= f(n-1)+n;
		System.out.println("result= "+result);
		return result;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(r(10));
		

		System.out.println(f(3));
		//f(3)=f(2)+3;
		//f(2)=f(1)+1
		//f(1)=1
	}
	

	
}
