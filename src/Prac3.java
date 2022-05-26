import java.io.*;

//실제 파일에 응용
//KOPO06 김우현
public class Prac3 {
	public static void main(String[] args) throws IOException {
		//file 객체를 하나 만든다(파라미터 값으로 경로 지정)
		File k6_f = new File("D:\\test\\전국무료와이파이표준데이터.csv");
		//bufferedReader로 위의 파일객체를 읽어온다.
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f));
		
		String k6_readtxt;	//한줄씩 읽어서 담을 string 변수를 선언한다.
		
		if((k6_readtxt = k6_br.readLine())==null) {		//첫번째 줄을 읽어서 그게 null값이면 빈 파일이라고 출력 후 리턴.
			System.out.println("빈 파일입니다.");
			return;
		}
		//첫번째 줄을 읽었는데 null이 아니기 때문에 그 한줄을 ,기준으로 잘라서 String 배열에 넣는다.(필드이름 나누기)
		String[] k6_field_name = k6_readtxt.split(",");
		
		int k6_LineCnt = 0;	//줄 수를 세기 위한 변수
		while((k6_readtxt = k6_br.readLine())!=null) {	//한 줄씩 읽는데 null값이 될 때까지(끝까지) 읽어오는 것임.
			//필드값을 담을 String 배열을 만들어 컴마를 기준으로 나누어준다.
			String[] k6_field = k6_readtxt.split(",");
			//줄의 수+1이 번째를 의미함
			System.out.printf("**[%d번째 항목]**************\n", k6_LineCnt+1);
			//for문을 돌릴 때 필드값의 개수(fieldname.length)까지로 인덱스값을 설정한다.
			for (int k6_i = 0; k6_i < k6_field_name.length; k6_i++) {	
				System.out.printf(" %s : %s\n", k6_field_name[k6_i], k6_field[k6_i]);
			}
			System.out.println("**************************");
			if(k6_LineCnt==100) break;	//데이터를 100개까지만 출력을 할 것이기 때문에 100되면 break로 멈춘다.
			k6_LineCnt++;	//위에서부터 하나씩 내려오며 읽을 것이기 때문에 cnt ++ 를 해주면서 while 돈다.
		}
		k6_br.close();	//작업이 끝난 후에는 close로 닫아준다
	}
}
