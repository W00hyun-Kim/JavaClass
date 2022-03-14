package Day7;
//ArrayList 활용해서 푼 문제
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String word = sc.nextLine();
		char arr1 [] = new char[input.length()];
				
		ArrayList aList = new ArrayList();
		
		if(input.contains(word)) {
			
			for (int i = 0; i < input.length(); i++) {
				if(input.charAt(i)==word.charAt(0)) {
					aList.add(i);
				}
			}
						
			int count = 0;
			String check = "";
			for(int i=0; i<aList.size(); i++) {
				int start_idx = Integer.valueOf(aList.get(i).toString());
				check = input.substring(start_idx, start_idx + word.length());
				if(check.equals(word)) { 
					count ++; 
				}
			}
			System.out.println(count);
		}				
	}
}
