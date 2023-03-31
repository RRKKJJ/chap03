package com.greedy.section02.package_and_import;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		com.greedy.section01.method.carculator carc = new com.greedy.section01.method.carculator();
		
		int min = carc.minNumberOf(30, 20);
		System.out.println("30과 20 중 더 작은 값은 : " + min);
		
		int max = com.greedy.section01.method.carculator.maxNumberOf(30, 20);
		
		System.out.println("30과 20 중 더 큰 값은 : " + max);
		
	}

}
