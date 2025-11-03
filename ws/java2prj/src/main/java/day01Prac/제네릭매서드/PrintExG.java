package day01Prac.제네릭매서드;

public class PrintExG {
	// 제네릭 매서드
	// 매개변수의 타입이 반드시 객체타입이어야 한다
	public static <T> void print(T t) {
		System.out.println(t);
	}

}
