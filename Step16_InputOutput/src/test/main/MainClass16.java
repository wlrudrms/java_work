package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// FileInputStream과 FileOutputStream을 이용해서 파일 복제하기2 배열이용
public class MainClass16 {
	public static void main(String[] args) {

		// 필요한 참조값을 담을 비역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// file not found exception 때문에 try block으로 묶어야한다
			// 파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/bottle.png");
			// 파일에 byte를 출력할 객체
			fos = new FileOutputStream("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/copied2.png");

			// byte[] 객체를 미리 준비한다.
			// 한번에 1kilo byte씩 읽어낼 수 있는 byte 배열
			byte[] buffer = new byte[1024];
			while (true) {
				// byte[] 배열을 메소드의 인자로 전달해서 읽어들이고 몇개를 읽어들였는지 리턴받는다.
				int readedByte = fis.read(buffer);
				if (readedByte == -1) {
					break;
				}
				// byte[] 배열의 0번방에서부터 읽은 만큼만 출력하기
				fos.write(buffer, 0, readedByte);
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
