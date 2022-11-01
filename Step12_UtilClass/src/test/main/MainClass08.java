package test.main;

/*
 *  while 문을 활용해서 원하는 횟수만큼 반복하기
 * 
 *  - 반복 횟수가 명확히 정해져 있으면 for문 사용
 *  - 반복 횟수가 명확히 정해져 있지 않고 반복해봐야 횟수를 아는 경우 while문 사용
 */
public class MainClass08 {
	public static void main(String[] args) {

		int count = 0;
		while (true) {
			System.out.println("안녕!");
			count++;
			// 특정 조건 하에서 무한루프 빠져나오기
			if (count == 5) {
				break;
			}
		}
		
		System.out.println("-----");
		count = 0;
		// 카운트가 5보다 작은 동안에 반복문 수행하기
		while (count < 5) {
			System.out.println("안녕!");
			count++;
		}
		
		System.out.println("-----");
		//for(;;){}  while(true){}와 같은 표현
	}
}
