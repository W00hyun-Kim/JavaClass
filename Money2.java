package D1;
// 수수료 포함 환전 계산 
public class Money2 {

	public static void main(String[] args) {
		int myWon = 1000000;	//100만원
		double moneyRate = 1238.21;	// 달러 환율
		double commission = 0.003;	// 환전 수수료 0.3%
		
		int usDollar = (int) (myWon/moneyRate); //형변환으로 버림처리(전체금액/환율)
		int remain = (int) (myWon-usDollar*moneyRate); //double로 계산 후 버림처리함
		
		double commissionPerOneDollar = moneyRate * commission;	//1달러 당 수수료
		double totalCommission = usDollar * commissionPerOneDollar;
		
		System.out.println("*********************************************************");
		System.out.println("*                      수수료  계산                        *");
		System.out.printf("총 수수료: %f원=>미화: %d달러, 달러당 수수료: %f원\n",totalCommission,usDollar,commissionPerOneDollar);
		System.out.println("*********************************************************");
	}
}
