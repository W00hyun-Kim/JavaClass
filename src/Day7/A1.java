package Day7;
import java.util.*;

public class A1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String input = sc.nextLine();
		char check = input.charAt(0);
		
		int index = -1;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)==check) {
				index = i;
				break;
			}
		}
		System.out.println(index+1);

	}

}
