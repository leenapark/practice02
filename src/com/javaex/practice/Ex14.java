package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pay, tax;
		System.out.println("수익을 입력해주세요");
		System.out.print("금익: ");
		pay = sc.nextDouble();
		
		tax = 1000*0.09;
		
		if(0<pay&&pay<=1000) {
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(1000<pay&&pay<=4000) {
			System.out.println("소득세는 "+(tax+0.18*(pay-1000))+" 입니다.");
		}else if(4000<pay&&pay<8000) {
			System.out.println("소득세는 "+(tax+3000*0.18+0.27*(pay-4000))+" 입니다.");
		}else if(8000<=pay) {
			System.out.println("소득세는 "+(tax+3000*0.18+4000*0.27+0.36*(pay-8000))+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
}
