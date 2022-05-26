import java.io.*;

//거리 계산
//KOPO06 김우현
public class Prac4 {

	public static void main(String[] args) throws IOException {	//IOException던지기
		//지정한 경로의 파일 객체 생성하기
		File k6_f = new File("D:\\test\\전국무료와이파이정보.txt");
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f));
		String k6_readtxt;	//한줄 씩 읽은 string 값을 넣을 변수 선언
		
		//첫번 째 줄은 필드 네임인데, 만약 첫줄이 null값이면 빈 파일입니다. 출력하게 만들어 놓기
		if((k6_readtxt = k6_br.readLine())==null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		//엑셀에서 미리 탭 기준으로 나눠지도록 설정을 해 둔 상태에서, \t 기준으로 나눠서 string 배열에 넣음
		String[] k6_field_name = k6_readtxt.split("\t");
		
		double k6_lat = 37.3860521;	//위도
		double k6_lng = 127.1214038;//경도
		
		int k6_LineCnt = 0;	//줄의 번째를 세기 위한 cnt 변수를 0으로 초기화
		while ((k6_readtxt = k6_br.readLine()) != null) {
	         String[] field = k6_readtxt.split("\t");
	         System.out.printf("**[%d번째 항목]***********************\n", k6_LineCnt);
	         System.out.printf("%s : %s\n", k6_field_name[10], field[10]); //10번 지번주소
	         System.out.printf("%s : %s\n", k6_field_name[13], field[13]); //13번 위도
	         System.out.printf("%s : %s\n", k6_field_name[14], field[14]); //14번 경도
	         //타겟 점과 위도 경도 사이의 거리
	         double dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - k6_lat, 2)
	               + Math.pow(Double.parseDouble(field[14]) - k6_lng, 2));	         
	         System.out.printf("현재 지점과 거리 : %f\n", dist);
	         System.out.printf("*************************************\n");
	         k6_LineCnt++;	//1씩 증가시켜주기
		}
		k6_br.close(); //끝나면 close()로 비워주기
	}

}
