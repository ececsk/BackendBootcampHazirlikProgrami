
public class MetotOverloading {
//Metotlarda Overloading (Aþýrý Yüklenme)

	static void print() {
		System.out.println("Parametresiz Metot");
	}

	static void print(int a) {
		System.out.println("Parametre int : " + a);
	}

	static void print(double a) {
		System.out.println("Parametre double : " + a);
	}
	
	static void print(int a,int b,char c) {
		System.out.println("Parametre double : " + a+", "+b+" ve "+c);
	}

	static int print(int a, int b) {
		return a + b;
	}

	static int print(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		print();
		print(12);
		System.out.println(print(2, 3));
		System.out.println(print(2, 3, 4));
		print(3,5,'A');
		print(12.0);
	}

}
