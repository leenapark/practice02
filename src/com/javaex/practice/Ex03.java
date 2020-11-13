package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이를 입력하세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		/*예상 해보기
		 * 15 1번 그룹
		 * 19 1번 그룹
		 * 20 1번 그룹
		 * 22 2번 그룹
		 * 100 2번 그룹
		 */
		
		if(age > 20) {
			System.out.println("\"1번 그룹\"");
		}else {
			System.out.println("\"2번 그룹\"");
		}
		
		System.out.println("입니다.");
		
		/*해설
		 * age > 20 --> T or F
		 * age = 15 --> F --> 2번 그룹
		 * age = 19 --> F --> 2번 그룹
		 * age = 20 --> F --> 2번 그룹
		 * age = 22 --> T --> 1번 그룹
		 * age = 100 --> T --> 1번 그룹
		 */
		
		sc.close();
	}
}
