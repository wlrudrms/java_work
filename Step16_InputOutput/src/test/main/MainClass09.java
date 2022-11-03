package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//이미 존재하거나 혹은 만들 예정인 파일을 제어할 수 있는 File객체 생성
		File f1 = new File("");
		try {
			//만일 해당 파일이 존재하지 않으면
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
