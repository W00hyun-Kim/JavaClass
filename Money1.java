package D1;
// 단순 환전 계산
public class Money1 {

	public static void main(String[] args) {
		int myWon = 1000000;	//100만원
		double moneyRate = 1238.21;	// 달러 환율
		double commission = 0.003;	// 환전 수수료 0.3%
		
		int usDollar = (int) (myWon/moneyRate); //형변환으로 버림처리(전체금액/환율)
		int remain = (int) (myWon-usDollar*moneyRate); //double로 계산 후 버림처리함
		
		System.out.println("***********************************************");
		System.out.println("*               수수료 없이 계산                  *");
		System.out.printf("총 한화환전금액: %d => 미화: %d달러, 잔돈: %d원\n",myWon, usDollar,remain);
		System.out.println("***********************************************");

	}

}
