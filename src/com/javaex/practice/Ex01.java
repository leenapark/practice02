package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {		
		int age = 15;
		
		/*오류 잡기 문제
		age가 0살 초과이고 18살 미만이면
		if(0 < age < 18) {
			System.out.println("청소년 입니다");
		}
		*/
		
		
		if(0<age&&age<18) {
			System.out.println("청소년 입니다");
		}

	}
}
