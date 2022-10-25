package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요.
		 * 단, MacBook 클래스를 절대 수정하지 마세요
		 */
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		//2. mac1 지역변수에 들어있는 참조값을 이용해서 .doGame()을 호출해보세요.;
		mac1.doGame();
		
		//참조하여 전달하는 방법
		Cpu c1 = new Cpu();
	    HardDisk h1 = new HardDisk();
	    Memory m1 = new Memory();
	    MacBook mb1 = new MacBook(c1 , m1, h1);
	      
	    mb1.doGame();
	}
}
