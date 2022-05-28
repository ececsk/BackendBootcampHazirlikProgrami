import java.util.Scanner;

public class BurcBul {

	public static void main(String[] args) {
		// Bur� Bulan Program
		//Ko�ullu ifadeler ile kullan�c�n�n burcunu bulan program yap�m�
		 
		Scanner input = new Scanner(System.in);

		int month, day;
		String burc = "";
		boolean isError = false;

		System.out.println("Do�du�unuz ay: ");
		month = input.nextInt();

		System.out.println("Do�du�unuz g�n: ");
		day = input.nextInt();

		switch (month) {
		case 1: // ocak
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "O�lak";
				} else {
					burc = "Kova";
				}
			} else {
				isError = true;
			}
			break;

		case 2:
			if (day >= 1 && day <= 29) {
				if (day < 20) {
					burc = "Kova";
				} else {
					burc = "Bal�k";
				}
			} else {
				isError = true;
			}
			break;

		case 3:
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					burc = "Bal�k";
				} else {
					burc = "Ko�";
				}
			} else {
				isError = true;
			}
			break;

		case 4:
			if (day >= 1 && day <= 30) {
				if (day < 21) {
					burc = "Ko�";
				} else {
					burc = "Bo�a";
				}
			} else {
				isError = true;
			}
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "Bo�a";
				} else {
					burc = "�kizler";
				}
			} else {
				isError = true;
			}
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					burc = "�kizler";
				} else {
					burc = "Yenge�";
				}
			} else {
				isError = true;
			}
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					burc = "Yenge�";
				} else {
					burc = "Aslan";
				}
			} else {
				isError = true;
			}
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					burc = "Aslan";
				} else {
					burc = "Ba�ak";
				}
			} else {
				isError = true;
			}
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				if (day < 23) {
					burc = "Ba�ak";
				} else {
					burc = "Terazi";
				}
			} else {
				isError = true;
			}
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				if (day < 23) {
					burc = "Terazi";
				} else {
					burc = "Akrep";
				}
			} else {
				isError = true;
			}
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				if (day < 22) {
					burc = "Akrep";
				} else {
					burc = "Yay";
				}
			} else {
				isError = true;
			}
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "Yay";
				} else {
					burc = "O�lak";
				}
			} else {
				isError = true;
			}
			break;
		default:
			isError = true;
			break;
		}

		if (isError) {
			System.out.println("Hatal� giri� yapt�n�z.Tekrar deneyiniz.");
		} else {
			System.out.println("Burcunuz: " + burc);
		}

	}

}
