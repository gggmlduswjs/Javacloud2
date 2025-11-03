package day01Prac.라이브러리만들기;

public class MyLib {

	
	// 1.  별(★ )을   3번 출력하는 매서드 만들기 
	
	public void printStarThree() {
		System.out.print("*");
		System.out.print("*");
		System.out.println("*");
	}
	
	// 2.  원하는 문자를 3번 출력하는 매서드 만들기
	
	public void printChar(char ch) {
		System.out.print(ch);
		System.out.print(ch);
		System.out.println(ch);
	}
	
	// 3.  원하는 코드를 3번 실행해 주는 매서드 만들기
	
//	public void runCode(이대훈 a) {
//		a.pizza();
//	}
//	
//	public void runCode2(HelloWorld a) {
//		a.printhelloWorld();
//	}
//	
//	public void runCode3(아무코드작성 a) {
//		a.아무코드작성();
//	}
	
	
	// 작성해야할 매서드에 대한 약속 정하기 (인터페이스 사용)
	// 
	
	public void runCode(MyRunnable r) {
		r.run();
		
	}
}