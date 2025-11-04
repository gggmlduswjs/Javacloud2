package day2.prac.람다.함수형인터페이스;

public class Ex05_방법2 {

	public static void main(String[] args) {
		// 익명
		
//		MyRunnable a = new MyRunnable() {};
		
		MyRunnable a = new MyRunnable() {

			@Override
			public void run() {
				System.out.println("에이콘학생 명단 출력^^");
				
			}};
			
			a.run();

	}

}
