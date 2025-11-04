package day2prac.실습과제;

public class Ex01_Runnable {

	public static void main(String[] args) {
		
		//1)클래스
		class A implements Runnable{

			@Override
			public void run() {
				System.out.println("유럽 여행");
			}
		}
		
		Runnable a = new A();
		a.run();
		
		
		//2)익명
		Runnable b = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("유럽 여행");
			}
		};
		b.run();
		
		
		//3)람다
		Runnable c = () -> System.out.println("유럽 여행");
		c.run();
		
	}

}
