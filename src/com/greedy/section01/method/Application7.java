package com.greedy.section01.method;

public class Application7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 20;
		int second = 10;
		char a = '/';
		Application7 carculator = new Application7();
		
		System.out.println("두 수를 더한 결과 : " + carculator.plus(first, second));
		
		System.out.println("두 수를 뺀 결과 : " + carculator.minus(first, second));
		
		System.out.println("두 수를 곱한 결과 : " + carculator.multiple(first, second));
		
		System.out.println("두 수를 나눈 결과 : " + carculator.divide(first, second));
		
		int p = carculator.plus(first, second);
		int m = carculator.minus(first, second);
		int u = carculator.multiple(first, second);
		int d = carculator.divide(first, second);
		
		int result = (a == '+')? p : (a == '-')? m : (a == '*')? u : d;
		System.out.println("연산 결과 : " + result);				

	}
	
	public int plus(int first, int second) {
		int result = first + second;
		return result;
	}
	
	public int minus(int first, int second) {
		int result = first - second;
		return result;
	}
	
	public int multiple(int first, int second) {
		int result = first * second;
		return result;
	}
	
	public int divide(int first, int second) {
		int result = first / second;
		return result;
	}

}
