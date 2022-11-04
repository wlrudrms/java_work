package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num = 1;
		String name = "호빵";
		String addr = "분식집";
		
		//MemberDto dto = new MemberDto(num, name, addr); 많아지면 불편하다.
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);

		// insert() 메소드 호출하면서 MemberDto 객체를 전달!
		update(dto);
	}
	
	//회원 한명의 정보를 수정하는 메소드
	public static void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			// 실행할 미완성의 sql 문
			String sql = "UPDATE member"
					+ " SET name = ?, addr = ?"
					+ " WHERE num = ?";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
