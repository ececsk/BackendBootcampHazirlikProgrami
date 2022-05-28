
public class Metotlar2 {
	// Return ve Void Kullanımı
	
	//return
static int sum(int a,int b) {
	return a+b;
	/*int result=a+b;
	 * // return result;
	 * System.out.println(result);
	 * return result
	 */
	
	
}

//void
static void sumVoid(int a,int b)
{
	int result=a+b;
	System.out.println(result);
}

	public static void main(String[] args) {
		int result=sum(5,2);
		//veya
		//int result=sum(5,2)+sum(3,1);
		System.out.println(result);
		
		System.out.println(sum(5,6));
		
		sumVoid(5,3);

	}

}
