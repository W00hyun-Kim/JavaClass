import java.io.*;

//파일 훝어보고 감잡기
//주가 데이터 실습
public class Prac7 {
	public static void main(String[] args) throws IOException {
		//dat 파일로 저장해놓은 파일 객체를 생성한다.
		File k6_f = new File("D:\\test\\THTSKS010H00.dat");
		//파일을 읽기위해 bufferedreader 준비
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f)); 
		String k6_readtxt; //파일을 한 줄씩 읽어서 readtxt 변수에 담기 위해서 변수 선언
		int k6_LineCnt = 0; //줄의 개수를 세기 위해서 변수 0으로 초기화
		int k6_n = -1;	//인덱스 값을 -1로 초기화한다.
		StringBuffer k6_s = new StringBuffer();
		//무한루프를 돌면서 한 줄씩 읽고자 한다.
		while (true) {
			char[] k6_ch = new char[1000]; //char 배열로 읽어오기

			k6_n = k6_br.read(k6_ch);	//배열로 쓰기
			if (k6_n == -1)		//마지막에 -1값 없으면 while문 빠져나오기
				break;

			for (char k6_c : k6_ch) {	//char 배열만큼 반복
				if (k6_c == '\n') {	//개행
					System.out.printf("[%s] ***\n", k6_s.toString());	//String을 찍고 난 후에
					k6_s.delete(0, k6_s.length());	//방금 출력한 String을 delete 시킨다.
				} else {	//개행이 아닐 시
					k6_s.append(k6_c);	//개행문자 나오기 전까지는 계속 string 붙여나가기
				}
			}
			k6_LineCnt++;
		}
		System.out.printf("[%s]***\n", k6_s.toString());	//맨 마지막 출력하고 버퍼 닫기
		k6_br.close();
	}
}
