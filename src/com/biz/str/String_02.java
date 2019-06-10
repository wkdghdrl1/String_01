package com.biz.str;

public class String_02 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Koreaddd";
		
		int intNationLength = 0;
		
		// length : 길이, 크기와 관련된 keword
		// 배열.length : 배열의 전체 개수 : 멤버변수
		// 문자열.length() : 문자열의 개수를 알려주는 method
		intNationLength = strNation.length();
		
		System.out.println("Nation 개수 : " + intNationLength);
		
		/*
		 * 배열의 개수를 알 수 있는 배열.length는 멤버변수이고 
		 * 문자열의 개수를 알 수 있는 문자열.length()는 method이다.
		 * 따라서 배열의 개수를 알 수 있는 멤버변수의 값을 읽는 것 보다는
		 * 문자열의 개수를 읽는 method를 실해하는 시간이 더 걸릴 것이다. 
		 * 	
		 */
		
		
	}
}
