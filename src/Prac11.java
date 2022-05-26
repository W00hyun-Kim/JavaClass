import java.io.*;

//실습3 : 삼성전자 주가에 대하여 2015년 최대값과 최소값을 구하시오
//KOPO06 김우현
public class Prac11 {
	public static void main(String[] args) throws IOException {
		
		// "\"는 특수 문자이므로 \\두개를 써야한다. 데이터베이스를 덤프받은 파일을 filewrite하여 csv로 적는다.
		File k6_f = new File("D:\\test\\A005930.csv");
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f));

		String k6_readtxt; // 읽어온 값을 저장할 String 변수를 선언해준다.
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		int targetMax = 0;
		int targetMin = 0;
		while ((k6_readtxt = k6_br.readLine()) != null) { // 한줄 씩 읽기
			
			if(k6_readtxt.substring(14,18).equals("2015")) {
				System.out.println("hello");
			}	
		}
//		
//		System.out.println("2015년 최대값 : "+targetMax);
//		System.out.println("2015년 최대값 : "+targetMin);
//		// 파일을 읽고 쓰는 것이 끝나면 버퍼를 닫아준다.
//		k6_br.close();
//		System.out.println("Program End");
	}
}
