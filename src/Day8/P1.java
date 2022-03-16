package Day8;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line1 = sc.nextLine();
			String line2 = sc.nextLine();

			String[] input1 = line1.split(" ");
			String[] input2 = line2.split(" ");

			for (int i = 0; i < input1.length; i++) {
				for (int j = 0; j < input2.length; j++) {
					if (Double.parseDouble(input1[i]) == Double.parseDouble(input2[j])) {
						System.out.print(input2[j] + " ");
					}
				}
			}
			System.out.println("\n");
		}
	}
}