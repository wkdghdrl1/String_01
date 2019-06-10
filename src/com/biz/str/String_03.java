package com.biz.str;

public class String_03 {
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		int intNationLen = strNation.length();
		
		// 문자열을 1글자씩 분리해서
		// 문자로 바꾸는 코드
		// 바꾼 문자를 콘솔에 표시
		
		//1번 코드 
		for(int i = 0 ;  i < intNationLen; i++) {
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}

		System.out.println();
		
		// 반복문 내에서 가급적 메소드 호출은 하지마라.
		
		//2번 코드 
		for(int i = 0 ;  i < strNation.length(); i++) {
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}
		
		/*
		 * 1번코드는 문자열의 길이를 계산하여 변수에 담아두고
		 * 변수값을 읽어 for 반복문을 순회한다.
		 * 
		 *  2번코드는 문자열의 길이를 계산하기 위하여
		 *  문자열의 길이(개수)만큼 계속해서 length() 메소드를 호출한다.
		 *  
		 *  따라서 1번코드보다는 변수를 생성해야되는 번거로움이 있지만
		 *  2번에 비하면 실행 속도가 더 빠르다.
		 *  
		 */

	}
}
