import java.util.Scanner;

public class BurcBulOdev {

	public static void main(String[] args) {
		// �DEV:Ko�ullu ifadeler ile (switch case kullanmadan) kullan�c�n�n burcunu bulan program yap�n�z.

		Scanner input = new Scanner(System.in);

		int month, day;

		System.out.println("Do�du�unuz ay: ");
		month = input.nextInt();

		System.out.println("Do�du�unuz g�n: ");
		day = input.nextInt();

		if (month == 1) {
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					System.out.println("O�lak");
				} else if (day >= 22 && day <= 31) {
					System.out.println("Kova");
				}

			}
		}

		else if (month == 2) {
			if (day >= 1 && day <= 29) {
				if (day < 20) {
					System.out.println("Kova");
				} else {
					System.out.println("Bal�k");
				}
			}
		}

		else if (month == 3) {
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					System.out.println("Bal�k");
				} else {
					System.out.println("Ko�");
				}
			}
		} else if (month == 4) {
			if (day >= 1 && day <= 30) {
				if (day < 21) {
					System.out.println("Ko�");
				} else {
					System.out.println("Bo�a");
				}
			}
		} else if (month == 5) {
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					System.out.println("Bo�a");
				} else {
					System.out.println("�kizler");
				}
			}
		} else if (month == 6) {
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					System.out.println("�kizler");
				} else {
					System.out.println("Yenge�");
				}
			}
		} else if (month == 7) {
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					System.out.println("Yenge�");
				} else {
					System.out.println("Aslan");
				}
			}
		} else if (month == 8) {
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					System.out.println("Aslan");
				} else {
					System.out.println("Ba�ak");
				}
			}
		}

		else if (month == 9) {
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					System.out.println("Ba�ak");
				} else {
					System.out.println("Terazi");
				}
			}
		} else if (month == 10) {
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					System.out.println("Terazi");
				} else {
					System.out.println("Akrep");
				}
			}
		} else if (month == 11) {
			if (day >= 1 && day <= 30) {
				if (day < 22) {
					System.out.println("Akrep");
				} else {
					System.out.println("Yay");
				}
			}
		} else if (month == 12) {
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					System.out.println("Yay");
				} else {
					System.out.println("O�lak");
				}
			}
		}

		else {
			System.out.println("Hatal� giri� yapt�n�z.Tekrar deneyiniz.");
		}

	}

}
