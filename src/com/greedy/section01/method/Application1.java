package com.greedy.section01.method;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() 시작됨...");
		
		Application1 app1 = new Application1();
		app1.methodA();
		
		Application1 app2 = new Application1();
		app2.methodB();
		
		
		System.out.println("main() 종료됨...");

	}
	
	public void methodA() {
		
		System.out.println("methodA() 호출함...");
		System.out.println("methodA() 종료됨...");
		
		
			
	}
	
	public void methodB() {
		
		System.out.println("methodB() 호출함...");
		System.out.println("methodB() 종료됨...");
		
	}

}
