//User inputs a series of numbers and assign them to a Stack

package Day9;
import java.util.*;

public class P3 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Iterator<String> iterator = stack.iterator();
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String target = sc.next();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			stack.add(arr[i]);
		}
//		System.out.println(stack);
		
		int index = 0;		
		while(iterator.hasNext()) {
			if(stack.pop().equals(target)) {
				System.out.println(index+1);
			}
			index++;
		}				
	}
}
