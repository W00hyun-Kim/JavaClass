import java.io.*;
//실습 2 : 분당융기원과 가장 가까운 곳과 먼곳을 찾아 인쇄 
//KOPO6 김우현
public class Prac5 {
	public static void main(String[] args) throws IOException {
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
				
				//폴리텍 위도 경도
				double k6_lat = 37.385806;	//위도
				double k6_lng = 127.121282;//경도
				//최대최소를 구하기 위해서 초기화함
				double k6_min = 1;
				double k6_max = 0;
				int k6_LineCnt = 0;	//줄의 번째를 세기 위한 cnt 변수를 0으로 초기화
				String k6_nearest="";
				String k6_far="";
				while ((k6_readtxt = k6_br.readLine()) != null) {
			         String[] k6_field = k6_readtxt.split("\t");
			         //폴리텍과 각 지점 사이의 거리를 구함
			         double k6_dist = Math.sqrt(Math.pow(Double.parseDouble(k6_field[13]) - k6_lat, 2)
			               + Math.pow(Double.parseDouble(k6_field[14]) - k6_lng, 2));	   			         
			         //최소거리 구하기
			         if(k6_dist<k6_min) {
			        	 k6_min = k6_dist;
			        	 k6_nearest = k6_field[1] +" "+ k6_field[2];
			         }	
			         //최대거리 구하기
			         if(k6_dist>k6_max) {
			        	 k6_max = k6_dist;
			        	 k6_far = k6_field[1] +" "+ k6_field[2];
			         }			         			         
			         k6_LineCnt++;	//1씩 증가시켜주기
				}				
				System.out.println("[ 폴리텍 분당융합기술교육원 기준 ]");
				System.out.println("가까운 곳 : " + k6_nearest);
				System.out.println("거리 : " + k6_min);
				System.out.println("먼 곳 : " + k6_far);
				System.out.println("거리 : " + k6_max);
				
				k6_br.close(); //끝나면 close()로 비워주기
			}
}
