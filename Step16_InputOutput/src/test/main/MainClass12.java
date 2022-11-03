package test.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 파일에 기록된 문자열을 읽어서 콘솔창에 출력해보세요.
 * FileReader 객체를 잘 활용해 보세요.
 */
public class MainClass12 {
	public static void main(String[] args) {
//		나의 답
//		try {
//			FileReader fr = new FileReader("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/memo.txt");
//			BufferedReader br = new BufferedReader(fr);
//			String str;
//	        while ((str = br.readLine()) != null) {
//	            System.out.println(str);
//	        }
//	        br.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr = new FileReader("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/memo.txt");
			//반복문 돌면서
			while(true) {
				//한글자씩 읽어들인다.
				int code = fr.read();
				//만일 더이상 읽을 문자가 없으면
				if(code == -1) {
					break; //반복문 탈출
				}
				//코드값을 문자로 변환해서
				char ch = (char)code;
				//개행기호 없이 읽은 내용만 출력
				System.out.print(ch);
			}
			fr.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
