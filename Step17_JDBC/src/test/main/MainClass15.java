package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서
		 *  MemberDto 객체에 담고
		 *  MemberDto 객체를 이용해서 DB에 저장하는 프로그래밍을 해 보세요
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:");
		String name = scan.next();
		System.out.println("주소:");
		String addr = scan.next();
		
		
		MemberDao dao = new MemberDao();
		//insert() 메소드에 전달할 MemberDto 객체 생성해서
		MemberDto dto = new MemberDto();
		// 추가할 회원의 정보를 담고
		dto.setName(name);
		dto.setAddr(addr);
		// MemberDao 객체를 이용해서 회원 정보를 추가하고 성공 여부를 리턴 받는다.
		boolean isSuccess = dao.insert(dto);
		// 성공 여부에 따라 다른 동작을 한다.
		if(isSuccess) {
			System.out.println(name+"의 정보를 추가 했습니다.");
		}else {
			System.out.println("회원정보 추가 실패");
		}
	}
}
