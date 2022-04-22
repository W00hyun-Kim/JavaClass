package D1;

public class Q {
	//#5. 소수점 이하에서는 어떻게 될까?
	public static void main(String[] args) {
		
		int MyVal = 14/5;	//2.8  소수점 이하 버리면 2, 반올림하면 3
		System.out.printf("#5-1 : %d\n", MyVal);	//int 변수에 넣으면 버림처리된다.
		
		double MyValF = 14/5;	
		System.out.printf("#5-2 : %f\n", MyValF);	//double로 계산을 하고 출력
		
		MyValF = 14.0/5;
		System.out.printf("#5-3 : %f\n", MyValF);	//한개라도 실수형태면 결과가 실수
		
		MyValF = (14.0)/5 + 0.5;
		System.out.printf("#5-4 : %f\n", MyValF);	//int 형변환안하면 반올림처리 되지 않음
		
		MyVal = (int)((14.0)/5 + 0.5);
		System.out.printf("#5-2 : %d\n", MyVal);	//int로 형변환하면 반올림처리 완료

	}

}
