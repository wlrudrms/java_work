package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainClass13 {
	public static void main(String[] args) {
		// file객체
		File memofile = new File("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder");
		
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr = new FileReader(memofile);
			BufferedReader br = new BufferedReader(fr);
			//반복문 돌면서
			while (true) {
				// 개행기호를 기준으로 한줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
