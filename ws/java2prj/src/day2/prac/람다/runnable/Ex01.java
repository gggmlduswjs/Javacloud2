package day2.prac.람다.runnable;


/*
 * interface Runnable {
 * 	void run();
 * 
 * }
 * 
 * 
 * */

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		//3가지방법
		
		class A implements Runnable {

			@Override
			public void run() {
				System.out.println("코드실행해줘 ^^");
				
			}
			
		}
		
		Runnable a =new A();
		a.run();
		
		// 2. 익명
		
		Runnable b= new Runnable() {

			@Override
			public void run() {
				System.out.println("익명객체로 구현"+"코드실행 익명");
				
			}}; // 오해금지 인터페이스로 객체를 생성하는 코드가 아님. 익명클래스를 정의하는 코드다.
		
			b.run();
			
			
			// 3. 람다 () -> {}
			
			Runnable c =() -> {
				System.out.println("먹고 싶은 거 출력하기");
				System.out.println("먹고 싶은 거 출력하기 + 크림빵");
				System.out.println("먹고 싶은 거 출력하기 + 크림 스파게티");
				System.out.println("먹고 싶은 거 출력하기 + 짜장면");
				System.out.println("먹고 싶은 거 출력하기 + 라떼");
				System.out.println("먹고 싶은 거 출력하기 + 사과");
				
				
				
				
				
			};
			
			c.run();
			
		
	}
	
	
	
}
