package D1;

//#3 정수형 변수의 나눗셈은 정수범위에서 버림 처리

public class Q3 {

	public static void main(String[] args) {
		// 정수형과 정수형의 연산은 결과값을 전부 버림처리해서 정수형으로 출력한다.
		int kopo6_i = 1000 / 3; // 333.33333333333.........
		System.out.printf("#3-1 : %d\n", kopo6_i);

		int kopo6_i2 = 1000 % 3; // 나머지 연산자
		System.out.printf("#3-2 : %d\n", kopo6_i2);
		System.out.println();

		for (int j = 0; j < 20; j++) {
			System.out.printf("#3-3 : %d", j + 1);
			System.out.println();

			// 나머지가 0인 경우는 5번마다 한번씩 있다.
			if (((j + 1) % 5) == 0) {
				System.out.printf("\n");
			}
		}
	}
}
