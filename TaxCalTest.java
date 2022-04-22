package D1;

import java.util.Iterator;

public class TaxCalTest {

	public static void main(String[] args) {
		//배열을 이용하여 각 과자의 가격과 양을 지정해주었다.
		String[] kopo06_item = {"과자1","과자2","과자3","과자4","과자5"};
		int[] kopo06_price = {10000,2000,3000,2500,1450};
		int[] kopo06_amount = {10, 2, 1, 3, 5 };
		double kopo06_taxRate = 0.1;
		int kopo06_totalSum = 0;	//나중에 누적합으로 총합을 구할 때를 위하여 0으로 초기화해두기.
		
		System.out.println("********************************");
		System.out.println("            구입 리스트            ");
		System.out.println("********************************");
		System.out.println(" 항 목     단 가   수 량       합 계    ");
		
		for (int kopỏ_i = 0; kopỏ_i < kopo06_item.length; kopỏ_i++) {
			int sum = kopo06_price[kopỏ_i] * kopo06_amount[kopỏ_i];		//for문을 이용하여 가격*개수로 누적합 총합을 구한다.
			kopo06_totalSum += sum;
			System.out.printf("%4s %8d %6d %10d\n", kopo06_item[kopỏ_i],kopo06_price[kopỏ_i],kopo06_amount[kopỏ_i],sum);
		}
		
		System.out.println("********************************");
		System.out.printf(" 지 불 금 액 : %19d\n",kopo06_totalSum);
		
		int totalNetPrice = (int)(kopo06_totalSum/(1+kopo06_taxRate));
		//과세금액은 세전금액을 말한다. 과세 대상 금액
		System.out.printf(" 과 세 금 액 : %19d\n",totalNetPrice);
		int tax = kopo06_totalSum - totalNetPrice;
		System.out.printf(" 세      금 : %19d\n", tax);
		
	}
}
