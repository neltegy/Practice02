package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double avg = 0.0;
		int sum = 0;
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum/arr.length;
		System.out.println("평균은"+avg+"입니다.");
	}
}
