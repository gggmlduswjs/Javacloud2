package day2.prac.람다.foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex02 {
	
	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();

		// 하나씩 등록
		drinks.add("콜라");
		drinks.add("사이다");
		drinks.add("환타");
		drinks.add("레몬에이드");
		drinks.add("오렌지주스");
		drinks.add("아이스티");
		drinks.add("밀크티");
		drinks.add("커피");
		drinks.add("에너지드링크");
		drinks.add("생수");
		
		
		//forEach() 매서드 : 반복수행
		// 반복하면서 하고 싶은 일(코드) 다르다
		// 약속으로 정해놓았다 - 인터페이스 Consumer
		/*
		 * 
		 * interface Consumer {
		 * 	public void accept(Object o);
		 * 
		 * }
		 * 
		 * 
		 * 	interface Consumer<T> {	// 매개변수가 있고 반환이 없다
		 * 		public void accept(T t);
		 * 
		 * }
		 * 
		 * */
		
		//3가지 방법(이름있는 클래스, 익명, 람다식)
		
		drinks.forEach((item)->{System.out.println(item + "람다!!");});
		
		drinks.forEach(item -> System.out.println(item + "람다 ^^"));
		
		// 1. 이름있는 클래스로 구현하기
		
		class A implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t+"이름있는 클래스로 구현");
				
			}
			
			
			
		}
		
		drinks.forEach(new A());
		
		
		//2. 익명
		
		drinks.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t +"익명 클래스로 구현");
				
			}});
		
		
		// 3. ()->{} => 함수형 인터페이스가 필요함 
		
		drinks.forEach((item) -> {
			System.out.println(item +"람다좋아"); });
		
		
		drinks.forEach(item -> System.out.println(item+"람다 완전 좋아"));
		
		
		
		
		
	}

}
