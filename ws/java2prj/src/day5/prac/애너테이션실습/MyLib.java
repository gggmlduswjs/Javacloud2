package day5.prac.애너테이션실습;

public class MyLib {
	
	@BeforeAndAfter(before="매서드실행되기 전에 출력합니다 ^^", after = "매서드 실행된 후 출력합니다 ~~ bye")
	public void printStar() {
		System.out.println("*****");
	}

}
