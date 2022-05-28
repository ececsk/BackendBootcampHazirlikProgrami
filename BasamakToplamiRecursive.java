
public class BasamakToplamiRecursive {
//Recursive metot ile basamak toplami
	public static void main(String[] args) {
		System.out.println("Basamak toplami: " + basamaklarToplami(45612));
	}

	static int basamaklarToplami(int sayi) {
		if (sayi == 0) {
			return 0;
		} else
			return sayi % 10 + basamaklarToplami(sayi / 10);

	}
}
