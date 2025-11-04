package day2.prac.람다.runnable;

public class MyRunnable구현하기 {
	
	public static void main(String[] args) {
		// 1.
		class A implements MyRunnable{

			@Override
			public void run() {
				System.out.println("버킷리스트");
				
			}
			
		}
		
		MyRunnable a = new A();
		a.run();
		
		
		// 2.
		
//		MyRunnable b = new MyRunnable() {};
		MyRunnable b = new MyRunnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("버킷리스트 익명");
			}};
			
			b.run();
		
		// 3.
			
		MyRunnable c = () -> {
			System.out.println("버킷리스트 람다");
		};
		
		c.run();
	}

}
