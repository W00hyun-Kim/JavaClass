package Day10;
import java.util.*;

public class P8 {
	public static void main(String[] args)  {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int arr[] = null;
			try {
				String size = sc.nextLine();
				int arrSize = Integer.parseInt(size);
				arr = new int[arrSize];
				
				String line = sc.nextLine();
				String str[] =line.split(" ");
				
				for (int i = 0; i < str.length; i++) {
					arr[i]=Integer.parseInt(str[i]);
				}	
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error");
				continue;
			}
			
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
			
			Collections.sort(list);				
			System.out.println(list);
		}
			
									
	}
}
