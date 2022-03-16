//Print Fibonacci numbers with ArrayList

package Day9;
import java.util.*;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			list.add(fibo(i));
		}
		System.out.println(list);
	}
	
	public static int fibo(int input) {
		if(input<=1) {
			return input;
		} else {
			return fibo(input-1) + fibo(input-2);
		}
	}
	
}
