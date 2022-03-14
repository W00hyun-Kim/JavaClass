package Day7;
import java.util.Arrays;

public class P4 {
	public static void main(String[] args) {
		int[] numbers = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int[] num1 = new int[numbers.length];
		int[] num2 = new int[numbers.length];
		int min=100;
		int max=0;
		int tmp = 0;
		
		// ascending
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < num2.length; j++) {
				if (numbers[i] > numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		} System.out.println(Arrays.toString(numbers));
		
		//Descending
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < num2.length; j++) {
				if (numbers[i] < numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		} System.out.println(Arrays.toString(numbers));
						
	}

}
