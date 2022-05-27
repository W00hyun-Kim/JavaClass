import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

//실습 1 : xml 파싱하기
//KOPO 김우현
public class Prac1 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//xml로 만들어진 파일을 읽어서 console에 파싱하여 띄우기 위한 작업을 위해서
		//documentBuilder가 필요함. 그를 위해서 import를 해주었음.(이 작업을 위해서 newInstance와 newDocumentBuilder생성)
		DocumentBuilder k6_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();		
		Document k6_doc = k6_docBuilder.parse(new File("D:\\test\\testdata.xml"));		
		//위에서 만든 docBuilder라는 객체에서 parse라는 함수를 통해서 경로값을 파라미터로 받아서 doc 변수에 담아준다.
		Element k6_root = k6_doc.getDocumentElement();
		//element 객체의 root라는 변수에 doc변수의 element값들을 넣어준다.
		
		//nodeList 객체를 이용하여 doc에 담겨져있는 element들을 각 변수에 넣어준다.
		//이때 각 엘레멘트값의 이름은 getElementBytagName을 통해서 접근을 한다.
		NodeList k6_tag_name = k6_doc.getElementsByTagName("name");
		NodeList k6_tag_studentid = k6_doc.getElementsByTagName("studentid");
		NodeList k6_tag_kor = k6_doc.getElementsByTagName("kor");
		NodeList k6_tag_eng = k6_doc.getElementsByTagName("eng");
		NodeList k6_tag_mat = k6_doc.getElementsByTagName("mat");
		
		//출력 부분
		System.out.println("*************************");
		//for문을 통해서 각 element에 접근하여 하나씩 출력을 해준다.
		//tagname의 갯수(크기)는 각 인원수와 동일하므로 index의 최종값은 tagname.getLength를 이용한다.
		for (int k6_i = 0; k6_i < k6_tag_name.getLength(); k6_i++) {
			//각 element 값들을 출력하기 위해서 각 element에 접근하기 위해서 해당 element 이름.item(인덱스).getFirstChild.getnode
			//아래와 같이 각 함수를 타고 들어가서 해당 value값을 차례대로 출력을 진행한다.
			System.out.printf("이름 : %s\n", k6_tag_name.item(k6_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k6_tag_studentid.item(k6_i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", k6_tag_kor.item(k6_i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", k6_tag_eng.item(k6_i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", k6_tag_mat.item(k6_i).getFirstChild().getNodeValue());
			System.out.println("*************************");
		}		
	}
}
