package Day8;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();
			int size = input.length();
			
			if(size%2==0) {
				System.out.print(input.charAt(size/2-1));
				System.out.print(input.charAt(size/2));
				System.out.println("\n");
			} else if(size%2!=0) {
				System.out.println(input.charAt(size/2));
				System.out.println();
			}
		}
		

	}

}
