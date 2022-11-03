package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\wlrud\\OneDrive\\Desktop\\java_mb\\myFolder/folder1");
		//폴더 만들기
		f1.mkdir();
		
		for(int i = 0; i < 1000; i++) {
			File tmp = new File(""+1);
			//tmp.mkdir(); // 폴더 만들기
			//tmp.delete(); // 폴더 삭제하기
		}
	}
}
