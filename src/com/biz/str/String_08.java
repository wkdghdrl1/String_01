package com.biz.str;

public class String_08 {

	public static void main(String[] args) {
		
		String userId = "Korea";
		String password = "!aa1234";
		
		/*
		 * 문자열을 비교연산할 때는
		 * equals() 메소드를 사용한다.
		 * 단, 대소문자 구분없이 비교하고자 할 때는 
		 * euqalsIgnoreCase를 사용한다. 
		 */
		if(userId.equalsIgnoreCase("KOREA") == false) {
			System.out.println("사용자 ID가 잘못되었습니다.");
		} else if(password.equals("!aa1234") == false) {
			System.out.println("비밀번호가 잘못되었습니다.");
		}else {
			System.out.println("로그인 성공!!!");
		}
		
	}
}
