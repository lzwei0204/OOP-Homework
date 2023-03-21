import java.util.*;
/**
 * 
 */

/**
 * @author 88693
 *
 */
public class Q9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, n = 2;
	
		System.out.println("請輸入一整數:");
	
		Scanner sc = new Scanner(System.in);
	
		num = sc.nextInt();
	
		if(num % 2 == 0) {
			System.out.println("此為偶數");
		}else {
			System.out.println("此為奇數");
		}
	
	}

}
