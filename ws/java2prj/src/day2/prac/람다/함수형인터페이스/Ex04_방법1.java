package day2.prac.람다.함수형인터페이스;

class A implements MyRunnable {
	@Override
	public void run() {
		System.out.println("2단 ^^");
		
	}
}

public class Ex04_방법1 {
	
	public static void main(String[] args) {
		
		
		MyRunnable a = new A();
		a.run();
		
		
		
	}

}
