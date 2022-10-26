package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums 에 담기
		int[] nums = { 0, 0, 0 };
		// 0번방에 10, 1번방에 20, 2번방에 30 을 저장해 보세요.
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 nums2에 담기
		int[] nums2 = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		System.out.println("main메소드가 정상 종료됩니다.");
	}
}
