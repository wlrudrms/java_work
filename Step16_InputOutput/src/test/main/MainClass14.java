package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		// file객체
		File memofile = new File("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder");

		// 필요한 객체를 담을 지역변수를 미리 만들어 준다.
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 미리 만들어둔 지역변수에 참조값 대입하기
			fr = new FileReader(memofile);
			br = new BufferedReader(fr);
			// 반복문 돌면서
			while (true) {
				// 개행기호를 기준으로 한줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				String line = br.readLine();
				if (line == null) {
					break;
				}
				// 읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// exception이 발생하건 안하건 실행할 수 있는 공간에서 마무리작업을 해준다.
			try {
				// 혹시 모를 null 로 넘어오는 상황을 위해 대비
				// 닫는 작업은 열린 순서의 역순으로 하면 좋다.
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
