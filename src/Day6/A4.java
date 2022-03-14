package Day6;
import java.util.*;
 
public class A4 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] str = input.split(" ");
//		System.out.println(Arrays.toString(str));
		double target = sc.nextDouble();
		
		double min = Integer.MAX_VALUE;
		String result = null;
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			double num = Double.parseDouble(str[i]);
			if(target==num) {
				continue;
			}
			double cha = Math.abs(num-target);
			if(cha<min) {
				min = cha;
				result = str[i];
			}
		} 
		System.out.println(result);				
	}
 
}
