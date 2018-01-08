package com.javaex.practice;

public class Problem03 {
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		char res[] = new char[c.length];
		for(int i = 0 ; i < c.length; i++) {
			System.out.print(c[i]);
			res[i] = c[i];
			if(c[i] == ' ') {
				res[i] = ',';
			}
			
		}
		System.out.println();
		for(int i = 0 ; i < c.length; i++) {
			System.out.print(res[i]);
		}
	}
}
