package Day7;
import java.util.*;

public class P7 {
	public static char[] original = {'a','b','c','d','e','f','g','h','i'};
	public static char[] encrypted = {'b','a','!','@','^','(',')','-','_'};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
//		for (int i = 0; i < line.length(); i++) {
//			System.out.print(encrp(line.charAt(i)));
//		}	
		
		for (int i = 0; i < line.length(); i++) {
			System.out.print(decrp(line.charAt(i)));
		}
		
		
	}
	
	public static char encrp(char a) {
		int index = -1;
		for (int i = 0; i < original.length; i++) {
			if(a==original[i]) {
				index = i;
				break;
			}
		}
		return encrypted[index];
	}
	
	public static char decrp(char a) {
		int index = -1;
		for (int i = 0; i < encrypted.length; i++) {
			if(a==encrypted[i]) {
				index = i;
				break;
			}
		}
		return original[index];
	}
}
