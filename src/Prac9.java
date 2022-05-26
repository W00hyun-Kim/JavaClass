import java.io.*;

//실습1 : 삼성전자 추출하여 csv 파일만들기
//KOPO06 김우현
public class Prac9 {
	public static void main(String[] args) throws IOException {

		// "\"는 특수 문자이므로 \\두개를 써야한다. 데이터베이스를 덤프받은 파일을 filewrite하여 csv로 적는다.
		File k6_f = new File("D:\\test\\StockDailyPrice.csv");
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f));
		// 적어줄 csv 파일을 파라미터 값으로 받아서 경로를 지정해준다.
		File k6_f1 = new File("D:\\test\\A005930.csv");
		BufferedWriter k6_bw1 = new BufferedWriter(new FileWriter(k6_f1));

		String k6_readtxt; // 읽어온 값을 저장할 String 변수를 선언해준다.

		while ((k6_readtxt = k6_br.readLine()) != null) { // 한줄 씩 읽기
			StringBuffer k6_s = new StringBuffer();
			//한 줄에 A005930가 포함된 경우(삼성전자인경우) 그 줄을 전부 Stringbuffer로 붙인다.
			if (k6_readtxt.contains("A005930")) {
				k6_s.append(k6_readtxt);
				System.out.println(k6_readtxt); 
			}
			k6_bw1.write(k6_s.toString());	//stringbuffer 값을 결과 csv 파일에 붙여준다.
			k6_bw1.newLine();	//개행
		}
		// 파일을 읽고 쓰는 것이 끝나면 버퍼를 닫아준다.
		k6_br.close();
		k6_bw1.close();
		System.out.println("Program End");
	}
}
