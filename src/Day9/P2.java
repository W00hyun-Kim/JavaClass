//User inputs a series of numbers and assign them to a Queue

package Day9;
import java.util.*;

public class P2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Iterator<String> iterator = queue.iterator();
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String target = sc.next();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			queue.offer(arr[i]);
		}
		System.out.println(queue);
		
		int index = 0;		
		while(iterator.hasNext()) {
			if(queue.poll().equals(target)) {
				System.out.println(index+1);
			}
			index++;
		}
	}
}

