package Day9;
import java.util.*;
public class P4 {

	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<Integer> score = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Input name and score.");
		System.out.println("Input \"print\" if you want to print");
		
		while (true) {
			String inputName = sc.next();
			if(inputName.equals("print")) {
				break;
			}
			int inputScore = sc.nextInt();
			name.add(inputName);
			score.add(inputScore);
		}
		
		AscendPrinting();
		System.out.println();
		DescendPrinting();

	}
	
	public static void AscendPrinting() {
		Collections.sort(name);
		Collections.sort(score);
		System.out.println("Ascending order");
		System.out.println(name);
		System.out.println(score);
	}
	
	public static void DescendPrinting() {
		Collections.reverse(name);
		Collections.reverse(score);
		System.out.println("Descending order");
		System.out.println(name);
		System.out.println(score);
	}

}
