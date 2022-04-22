package D1;
// #2 누적하기, 합 구하기

public class Q2 {

	public static void main(String[] args) {
		int kopo6_sum = 0;	//누적, 루프는 초기화를 해야한다.
		
		//1~100까지 더하기
		for (int i = 0; i < 101; i++) {
			kopo6_sum += i;
		}
		
		//평균을 처리하기 위해서 더한 값
		System.out.printf("#2 : %d\n", kopo6_sum);
		//평균을 구하기 위하여 더한 값을 갯수로 나누기
		System.out.printf("#2-2 : %d\n", kopo6_sum/100);
		
		//배열을 이용하여 더하기
		int[] kopo6_v = {1,2,3,4,5};
		int kopo6_vSum = 0;
		
		//배열에 들어있는 모든 숫자 더하기
		for (int i = 0; i < 5; i++) {
			kopo6_vSum = kopo6_v[i];
		}
		//결과 값은 배열 안의 요소들의 총합
		System.out.printf("#2-3 : %d\n", kopo6_vSum);
	}

}
