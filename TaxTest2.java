package D1;

public class TaxTest2 {
	
	//같은 클래스 내에서 만든 함수이기 때문에 추후에 함수 사용할 때 객체 생성하지 않아도 호출 가능하다
	//아래의 경우 리턴 값이 지정된 경우이기에 void가 아닌 int를 써주었다.
	//세전 가격 구하는 함수
	public static int netPrice(int price, double rate) {
		return (int)(price/(1+rate));	//세전 가격을 구하기 위해서는 소비자가 / (1+세율)
	}
		
	public static void main(String[] args) {
		int price = 1234;			//세금포함된 판매 가격
		double taxRate = 0.1;
		
		int targetNetPrice = netPrice(price, taxRate);	//함수를 불러서 세전가격을 구한다.
		int tax = price - targetNetPrice;	//세금은 판매가-세전가격
		
		System.out.println("****************************************");
		System.out.println("*       소비자가, 세전가격, 세금 계산        *");
		System.out.printf(" 소비자가격:%d, 세전가격: %d, 세금 : %d\n",price, targetNetPrice,tax);		
		System.out.println("****************************************");
		
	}
}
