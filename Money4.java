package D1;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// #Decimal Format 이용하여 컴마를 찍어보기
public class Money4 {

	public static void main(String[] args) {
		//해당 클래스를 이용하기 위해서 객체를 생성하여 형식을 입력해주었다.
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
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
		
		//decimal, Calendar 클래스 이용한 값들은 String으로 받기에 print %s로 변경해야 한다.
		System.out.println("**************************************************************");
		System.out.println("*                   컴마찍기, 날짜적용                           *");
		System.out.printf("총 수수료: %s원=>미화: %s달러, 달러당 수수료: %f원\n",df.format(i_totalCommission),
															df.format(usDollar),commissionPerOneDollar);
		System.out.println("**************************************************************");
		
		remain = (int)(myWon - usDollar*moneyRate-i_totalCommission);
		System.out.printf("총 한화환전금액: %s원=>미화: %s달러, 수수료징수: %s원, 잔돈:%s\n",df.format(myWon),df.format(usDollar),
																	df.format(i_totalCommission), df.format(remain));
		System.out.printf("최종 실행 시간 : %s\n", sdf.format(cal.getTime()));	
		System.out.println("**************************************************************");
		
	}

}
