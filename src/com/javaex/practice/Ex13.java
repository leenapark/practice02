package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		double x;
		x = sc.nextDouble();
		double y = Math.pow(x, 3);
		
		if(x<=0) {
			System.out.println("계산결과는 "+(x=(double) (y-9*x+2))+" 입니다.");	
		}else if(x>0) {
			System.out.println("계산 결과는 "+(x=(double) (7*x+2))+" 입니다.");
		}
		
		sc.close();
	}
}
