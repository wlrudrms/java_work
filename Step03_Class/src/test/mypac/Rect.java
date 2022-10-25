package test.mypac;

public class Rect {
	public int width;
	public int height;

	public void showArea() {
		//System.out.println(this.width * this.height);  - 나의 풀이
		int area = this.width * this.height;
		System.out.println("면적은 " + area + "입니다.");
	}
}
