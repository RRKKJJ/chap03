package com.greedy.section02.package_and_import;

import static com.greedy.section01.method.carculator.maxNumberOf;

import java.sql.Date;

import com.greedy.section01.method.carculator;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carculator calc = new carculator();
		int min = calc.minNumberOf(50, 60);
		
		System.out.println("50과 60 중 작은 값은 : " + min);
		
		int max = carculator.maxNumberOf(50, 60);
		
		System.out.println("50과 60 중 큰 값은 : " + max);
		
		int max2 = maxNumberOf(100, 200);
		
		System.out.println("100과 200 중 큰 값은 : " + max2);
		
		// 다른패키지의 같은 클래스명 2개를 import 하고 싶으면 하나는 import하고 하나는 풀네임을 써준다.
		
		Date date = new Date(System.currentTimeMillis());
		

	}

}
