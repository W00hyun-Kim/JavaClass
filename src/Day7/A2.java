package Day7;
import java.util.*;

public class A2 {
	
	//Initialize an integer array.
	public static int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for (int i = 0; i < numbers.length; i++) {
			if(Integer.toString(numbers[i]).contains(input)) {
				System.out.print(numbers[i]+ " ");
			}
		}
	}
}
