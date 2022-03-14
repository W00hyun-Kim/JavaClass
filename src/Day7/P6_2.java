package Day7;
//배열 이용해서 푼 문제
import java.util.Scanner;

public class P6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		char[] c1 = new char[line1.length()]; // 중요
		for (int i = 0; i < line1.length(); i++) {
			c1[i] = line1.charAt(i);// 배열 순서화
		}

		String line2 = sc.nextLine();
		char[] c2 = new char[line2.length()];
		for (int i = 0; i < line2.length(); i++) {
			c2[i] = line2.charAt(i);
		}

		int cnt = 0;
		if (c1.length >= c2.length) {
			for (int i = 0; i < c1.length - c2.length + 1; i++) {
				int sameCnt = 0;
				for (int j = 0; j < c2.length; j++) {
					if (c1[i + j] == c2[j]) {
						sameCnt++;
					}
				}
				if (sameCnt == c2.length) {
					cnt++;
				}
			}
		} else {
			System.out.println("error");
		}

		System.out.println(cnt);
	}

}
