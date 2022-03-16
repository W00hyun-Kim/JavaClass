package Day9;
import java.util.*;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		
		System.out.printf("1 : %d\n",size(word1));
		System.out.printf("2 : %d\n",size(word2));
		System.out.printf("3 : %d\n",sameNum(word1,word2));

	}
	
	public static int size(String str) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			String alpha = ""+str.charAt(i);
			list.add(alpha);
		}
		return list.size();		
	}
	
	public static int sameNum(String str1, String str2) {
		int[] alpha = new int[26];
		int[] beta = new int[26];
				
		int cnt = 0;
		for (int i = 0; i < str1.length(); i++) {
			int index = str1.charAt(i)-97;
			alpha[index]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			int index2 = str2.charAt(i)-97;
			beta[index2]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0 && beta[i] != 0) {
				cnt++;
			}
		}		
		return cnt;
		
	}
			
}
