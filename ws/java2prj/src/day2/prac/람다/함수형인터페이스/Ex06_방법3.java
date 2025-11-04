package day2.prac.람다.함수형인터페이스;

public class Ex06_방법3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable a = () -> {
			
			System.out.println("hi 람다식, 땡큐 ^^");
			System.out.println("hi 람다식, 땡큐 ^^");
			System.out.println("hi 람다식, 땡큐 ^^");
			
		};
		
		a.run();
		
		MyRunnable b = () -> System.out.println("hi 람다식 좋아"); // 익명클래스 익명 객체
		
		b.run();

	}

}
