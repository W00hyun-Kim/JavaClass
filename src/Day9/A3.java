package Day9;
import java.util.*;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int num = 1;		//numbering
		while(true) {			
			int sum = 0;
			int input = sc.nextInt();
			arr.add(input);
			for (Integer i : arr) {		
				sum+=i;
			}
			int mean = sum/arr.size();
			int max = Collections.max(arr);
			int min = Collections.min(arr);
			
			System.out.printf("Result: %d - Mean %d, Max %d, Min %d\n",num,mean,max,min);
			num++;
		}
	}
}
