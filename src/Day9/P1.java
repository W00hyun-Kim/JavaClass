//Split a String and Sort
package Day9;
import java.util.*;

public class P1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		
		//Sorting ascending order
		Collections.sort(list);
		System.out.println(list);
		
		//Sorting descending order
		Collections.reverse(list);		
		System.out.println(list);
		
	}

}
