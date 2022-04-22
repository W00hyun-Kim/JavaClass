package D1;

public class Tax1 {

	public static void main(String[] args) {
		TaxCal taxcal = new TaxCal(); 	//객체 생성
		int val = 271; 	//세전 물건값
		int rate = 3;	//세금 3%
		
		int tax = taxcal.taxCal(val,rate);
		
		System.out.println("**********************************");
		System.out.println("*          단순 세금 계산           *");
		System.out.printf("실제 세금 계산: %f\n", val*rate/100.0);
		System.out.printf("세전가격: %d 세금: %d, 세포함 가격: %d\n",val,tax,val+tax);
		
		System.out.println("**********************************");
	}
}

class TaxCal {
	public static int taxCal(int val, int rate) {
		int ret;	//세금값 계산하는 함수 (세금값 = 세전물건값 * 세금/100)
		//계산은 double로 소수점까지 정확하게 계산
		//계산 값이 1원 미만 금액이 생기면 올림을 한다.
		if(((double)val * (double)rate/100.0) == val*rate/100) {
			ret = val*rate/100;		//딱 나누어 떨어졌을 때
		} else {
			ret = val * rate/100 +1; 	//소수점이 나오면 1올려서 올림처리
		}
		//마지막엔 int로 소수점 올리기
		return ret;
		
	}
}