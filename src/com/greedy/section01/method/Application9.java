package com.greedy.section01.method;

public class Application9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carculator carc = new carculator();
		
		int first = 100;
		int second = 50;
		
		int min = carc.minNumberOf(first, second);
		System.out.println("두 수 중 최소값은 : " + min);
		
		int max = carculator.maxNumberOf(first, second);
		System.out.println("두 수 중 최대값은 : " + max);
		
//		int max2 = carc.maxNumberOf(first, second);

	}

}
