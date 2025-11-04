package day2.prac.람다.오전실습.손민영;

class MyClass implements MyInterface_SMY {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("이름 있는 클래스 인터페이스 상속");
	}
}

public class Ex07_SMY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 있는 클래스
		MyInterface_SMY imple = new MyClass();
		imple.run();
		
		// 익명 클래스
		MyInterface_SMY unknown = new MyInterface_SMY() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("익명 클래스 방식");
			}
		};
		unknown.run();
		
		// 람다식
		MyInterface_SMY ramda = () -> System.out.println("함수형 인터페이스 - 람다식 방식");
		ramda.run();
	}

}
