package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// FileInputStream과 FileOutputStream을 이용해서 파일 복제하기
public class MainClass15 {
	public static void main(String[] args) {

		// 필요한 참조값을 담을 비역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// file not found exception 때문에 try block으로 묶어야한다
			// 파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/bottle.png");
			// 파일에 byte를 출력할 객체
			fos = new FileOutputStream("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/copied.png");
			while (true) {
				// byte 알갱이 하나씩 읽어들이기
				int data = fis.read();
				// 더이상 읽을 byte가 없다면
				if (data == -1) {
					break; // 반복문 탈출
				}
				System.out.println(data);
				// 읽은 byte 알갱이 하나를 출력하기
				fos.write(data);
				fos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
			} catch (Exception e) {
			}
		}
	}
}
