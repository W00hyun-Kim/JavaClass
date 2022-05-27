import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//실습 : JSON 파싱하기
//KOPO06 김우현
public class Prac3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//기존에 json파일로 만들어 놓은 파일을 parsing 하기 위해서 예외처리하고 parser 객체를 만든다.
		JSONParser k6_parser = new JSONParser();		
		//해당 파일의 파라미터 값으로 파일의 경로를 지정해준다.
		Object k6_obj = k6_parser.parse(new FileReader("D:\\test\\test.json"));
		
		//JSONObject jsonObject = (JSONObject) obj;		
		JSONArray k6_array = (JSONArray)k6_obj;	//키가 따로 없는 배열이기 때문에 이처럼 연결 가능
		
		System.out.println("*******************************");
		for (int k6_i = 0; k6_i < k6_array.size(); k6_i++) {	//배열 크기만큼 반복한다.
			JSONObject k6_result = (JSONObject) k6_array.get(k6_i);	//Array에서 하나를 추출
			System.out.println("이름 : "+k6_result.get("name"));//이름 가져오기
			System.out.println("학번 : "+k6_result.get("studentid"));//학번가져오기
			
			JSONArray k6_score = (JSONArray) k6_result.get("score"); //배열을 이용하여 성적값들 가져오기
			//score값을 long 값으로 받아서 사용한다.
			long k6_kor = (long)k6_score.get(0);	//인덱스0 : 국어
			long k6_eng = (long)k6_score.get(1);	//인덱스1 : 영어
			long k6_mat = (long)k6_score.get(2);	//인덱스2 : 수학
			System.out.println("국어 : "+k6_kor);
			System.out.println("영어 : "+k6_eng);
			System.out.println("수학 : "+k6_mat);
			System.out.println("총점 : "+(k6_kor + k6_eng + k6_mat));
			System.out.println("평균 : "+(k6_kor+k6_eng+k6_mat)/3.0);	//성적표 실습할 때처럼 나눌 떄는 double로 나눔
			System.out.println("*******************************");
		}
	}
}
