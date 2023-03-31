package com.greedy.section01.method;

/**
 * <pre>
 * 연습
 * </pre>
 * @author 류경진
 * @version
 */
public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application4 app4 = new Application4();
		app4.testMethod("류경진", 28, '남');
		
		String name = "류경진";
		int age = 28;
		char gender = '남';
		
		app4.testMethod(name, age, gender);

	}
	
	/**
	 * <pre>
	 * 이름과 나이의 성별을 전달받아 한 번에 출력해주는 기능을 제공
	 * </pre>
	 * @param name   출력할 이름
	 * @param age    출력할 나이
	 * @param gender 출력할 성별(성별은 변경되지 않음)
	 */
	public void testMethod(String name, int age, final char gender) {
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며 성별은 " + gender + "자입니다.");
	}

}
