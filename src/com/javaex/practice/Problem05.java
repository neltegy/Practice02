package com.javaex.practice;

import java.math.*;

public class Problem05 {
	public static void main(String[] args) {
		int[] ran = {0,0,0,0,0,0};
		int i = 0; 
		wh : while(true) {
			ran[i] = (int)(Math.random()*45) + 1;
			int compare = ran[i];
			System.out.println(ran[i]);
			for(int j = 0 ; j < ran.length; j++) {
				if(compare == ran[j]) {
					continue;
				}
			}
			
			i++;
			if(i == 6) {
				break wh;
			}
		}
	}
}
