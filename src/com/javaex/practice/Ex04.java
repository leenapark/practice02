package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제 19세 이상 65세 미만 "1번 그룹" 그 외 "2번 그룹" 으로 출력
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(19<=age||age>65) {
			System.out.print("1번 그룹");
		}else {
			System.out.print("2번 그룹");
		}
		System.out.println(" 입니다");
		
		sc.close();
	}
}
