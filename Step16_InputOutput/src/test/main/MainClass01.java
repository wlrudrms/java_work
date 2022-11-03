package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 *  입력, 출력 ( Input, Output )
 *  
 *  - 어떤 대상으로 부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다.
 *  - 프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체로 생각하면 편하다.
 *  - 데이터는 2진수로 이루어져 있지만 2진수 8개의 묶음인 1byte 단위로 생각하면 편하다.
 *  - 1byte는 총 256가지 값을 표현할 수 있다.
 *  - 1byte를 10진수로 환산하면 0~255 사이의 숫자 중에 하나이다.
 *  - 입력과 출력을 통해서 이동하는 데이터는 byte 하나하나가 이동한다고 생각하면 된다.
 *  
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 키보드와 연결된 InputStream type의 참조값을 kbd라는 지역변수에 담기
		// InputStream 객체는 1byte 단위 처리 스트림이다.
		// 영문자 대소문자,숫자, 특수문자만 처리할 수 있다.
		// 한글처리 불가
		InputStream kbd = System.in;
		System.out.println("입력:");
		
		try {
			//입력한 키의 코드값 읽어오기
			int code = kbd.read();
			System.out.println("code:"+code);
			//코드에 대응되는 문자 얻어내기
			char ch = (char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
