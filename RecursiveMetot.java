
public class RecursiveMetot {
	// Recursive (�zyineli) Metotlar
	// Bir metotun kendi i�inde kendisini tekrar �a��rma i�lemidir. Genellikle de�er
	// d�nd�ren metotlarda kullan�l�r ve genellikle void metotlarda i�e yaramaz

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
		
		//�imdi bunu fonksiyonlar �zerinden nas�l yapabildi�imize bakal�m.Burada recursive metotlar devreye giriyor.

	}*/
	
	/*static int r(int n) { 
		System.out.println(n);
		//return r(n-1)+n;// bu �ekilde yazd���m�zda infinity loopa giriyor ve en sonunda haf�zan�n doldu�u hatas�n� al�yoruz o y�zden 1 oldu�unda bitirmek istiyoruz
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
