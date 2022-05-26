import java.io.*;

//감 잡은 내용으로 파일 정제
//KOPO06 김우현
public class Prac8 {
	public static void main(String[] args) throws IOException {
		//"\"는 특수 문자이므로 \\두개를 써야한다. 데이터베이스를 덤프받은 파일을 filewrite하여 csv로 적는다.
		File k6_f = new File("D:\\test\\THTSKS010H00.dat");
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f));
		//적어줄 csv 파일을 파라미터 값으로 받아서 경로를 지정해준다.
		File k6_f1 = new File("D:\\test\\StockDailyPrice.csv");
		BufferedWriter k6_bw1 = new BufferedWriter(new FileWriter(k6_f1));
				
		String k6_readtxt;	//읽어온 값을 저장할 String 변수를 선언해준다.
		
		int k6_cnt=0; int k6_wcnt=0;	//cnt : 기존 dat파일의 줄수, wcnt: csv로 적은 줄 수
		
		while((k6_readtxt=k6_br.readLine())!=null) {	//한줄 씩 읽기
			StringBuffer k6_s = new StringBuffer(); 
			String[] k6_field = k6_readtxt.split("%_%"); //%_%으로 나누어져있던 필드값들을 기준으로 잘라서 배열에 넣음
			
			//만약 필드 값이 2보다 크고, 필드의 2인덱스의 ^를 지우고 공백을 제거하여 0부터 1로 잘랐을 때 이게 A와 같다면
			if(k6_field.length>2 && k6_field[2].replace("^", "").trim().substring(0,1).equals("A")) {
				k6_s.append(k6_field[0].replace("^","").trim());	//String버퍼에 붙여준다.
				for (int k6_i = 1; k6_i < k6_field.length; k6_i++) {
					k6_s.append("." + k6_field[k6_i].replace("^", "").trim());
				}	//그리고 for문을 돌면서 .(점)을 기준으로 붙여나간다.
				k6_bw1.write(k6_s.toString()); //csv 파일에 Stringbuffer인 s를 filewrite한다.
				k6_bw1.newLine();	//다 적으면 개행한다.
				k6_wcnt++;	//그리고 줄 수를 count한다.
				System.out.printf("write [%d][%d][%s]\n",k6_cnt,k6_wcnt,k6_s.toString());//현재진행상황 파악				
			}
			k6_cnt++;
		}
		//파일을 읽고 쓰는 것이 끝나면 버퍼를 닫아준다.
		k6_br.close();
		k6_bw1.close();
		//csv 파일로 filewrite가 완료되면 아래 문구 출력하고 프로그램 끝낸다.
		System.out.printf("Program End[%d][%d] records\n", k6_cnt, k6_wcnt);
	}
}
