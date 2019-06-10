package com.biz.str;

public class String_09 {

	public static void main(String[] args) {
		
		String strKorea = "Korea";
		
		boolean bYes = true;
		
		bYes = strKorea.equals("KOREA");
		System.out.println(strKorea + " eq KOREA : " + bYes);

		bYes = strKorea.equalsIgnoreCase("KOREA");
		System.out.println(strKorea + " eq KOREA : " + bYes);
		
		// equals()와 거의 같은 기능
		bYes = strKorea.matches("Korea");
		System.out.println(strKorea + " ma KOREA : " + bYes);

		// strKorea 문자열내에 Ko라는 문자열이 포함되어 있냐?
		bYes = strKorea.contains("Ko");
		System.out.println(strKorea + " contains ko : " + bYes);
	
	}

}
