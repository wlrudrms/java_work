package test.mypac;

public class Member {
	public String name;
	public int num;
	public String addr;
	
	public void showInfo() {
		//필드에 저장된 내용을 활용해서 정보를 출력하기
		System.out.println("번호:" + this.num + ", 이름:" + this.name + ", 주소:" + this.addr);
	}
}
