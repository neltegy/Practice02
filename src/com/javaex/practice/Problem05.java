package com.javaex.practice;

import java.math.*;

public class Problem05 {
	public static void main(String[] args) {
		int[] ran = {0,0,0,0,0,0};
		int i = 0; 
		wh : while(true) {
			int compare = (int)(Math.random()*45) + 1;
			for(int j = 0 ; j < ran.length; j++) {
				if(compare == ran[j]) {
					continue wh;
				}
			}
			ran[i] = compare;
			System.out.println(ran[i]);
			i++;
			if(i == 6) {
				break wh;
			}
		}
	}
}
