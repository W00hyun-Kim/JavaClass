package Day6;
import java.util.*;
//Reverse a number
public class A2 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		reverse(input);
 
	}
	
	public static void reverse(String input) {
		char[] ch = new char[input.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=input.charAt(i);
		}
		
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
	}
 
}