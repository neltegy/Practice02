package com.javaex.practice;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액:");
		int input = scan.nextInt();
		if(input/50000 != 0) {
			System.out.println("50000원:"+input/50000+"개");
			input = input - 50000*(input/50000);
		}
		if(input/10000 != 0) {
			System.out.println("10000원:"+input/10000+"개");
			input = input - 10000*(input/10000);
		}
		if(input/5000 != 0) {
			System.out.println("5000원:"+input/5000+"개");
			input = input - 5000*(input/5000);
		}
		if(input/1000 != 0) {
			System.out.println("1000원:"+input/1000+"개");
			input = input - 1000*(input/1000);
		}
		if(input/500 != 0) {
			System.out.println("500원:"+input/500+"개");
			input = input - 500*(input/500);
		}
		if(input/100 != 0) {
			System.out.println("100원:"+input/100+"개");
			input = input - 100*(input/100);
		}
		if(input/50 != 0) {
			System.out.println("50원:"+input/50+"개");
		}
		if(input/10 != 0) {
			System.out.println("10원:"+input/10+"개");
			input = input - 10*(input/10);
		}
		if(input/5 != 0) {
			System.out.println("5원:"+input/5+"개");
			input = input - 5*(input/5);
		}
		if(input/1 != 0) {
			System.out.println("1원:"+input/1+"개");
		}
	}
}
