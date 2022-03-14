package Day6;
import java.util.*;

public class A2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(reverse(input));

	}
	
	
	public static String reverse(int input) {
		String result = "";
		while(input>0) {
			result = result + (input%10);
			input = input/10;
		}
		return result;
	}

}
