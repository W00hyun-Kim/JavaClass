package D1;
//수수료 포함 환전 계산(3)
//수수료를 고려하여 달러를 바꿔주기 (1달러 당 원화금액 + 1달러당 수수료)로 실수형 계산하기

public class Money3 {

	public static void main(String[] args) {
		int myWon = 1000000;	//100만원
		double moneyRate = 1238.21;	// 달러 환율
		double commission = 0.003;	// 환전 수수료 0.3%
		double commissionPerOneDollar = moneyRate * commission;	//1달러 당 수수료
		//★중요한 부분 : 1달러당 커미션으로 usDollar를 구해서 그걸로 계산을 진행해야한다.
		int usDollar = (int) (myWon/(moneyRate + commissionPerOneDollar));	//1달러 당 수수료로 계산하기
		double totalCommission = usDollar * commissionPerOneDollar;
		
		int remain = (int) (myWon-usDollar*moneyRate); //double로 계산 후 버림처리함 //환전 후 돌려받을 값
		
		//수수료 올림처리
		int i_totalCommission;	//수수료 징수 금액 총 비용
		if(totalCommission != (double)((int)totalCommission)) {	
			i_totalCommission = (int)totalCommission+1;
		} else {	
			i_totalCommission = (int)totalCommission;
		}
		
		
		System.out.println("**************************************************************");
		System.out.println("*                   (정확한)수수료 적용환전                       *");
		System.out.printf("총 수수료: %d원=>미화: %d달러, 달러당 수수료: %f원\n",i_totalCommission,
																		usDollar,commissionPerOneDollar);
		System.out.println("**************************************************************");
		
		remain = (int)(myWon - usDollar*moneyRate-i_totalCommission);
		System.out.printf("총 한화환전금액: %d원=>미화: %d달러, 수수료징수: %d원, 잔돈:%d\n",myWon,usDollar,
																				i_totalCommission, remain);
		
		System.out.println("**************************************************************");

	}

}
