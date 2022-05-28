
public class WhileDongusu2 {
//100 ile 200 arasýnda tam ortada olan sayý
	public static void main(String[] args) {
		int left=100,right=200;
		
		while(++left < --right);
		
		System.out.println(left);

	}

}
