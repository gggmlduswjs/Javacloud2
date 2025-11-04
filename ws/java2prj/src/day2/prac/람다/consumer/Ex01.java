package day2.prac.람다.consumer;

import java.util.function.Consumer;

/*
 	
 	interface Consumer<T> {
 		public void accept(T t);
 	
 	}
 
 
 * */
public class Ex01 {

	public static void main(String[] args) {
		
		// 3가지 방법 구현하기
		
		class A implements Consumer <String> {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t+"^^");
				
			}
			
		}
		
		Consumer<String> a = new A();
		a.accept("인터페이스 구현 이름있는 클래스");
		
		// 2
		
//		Consumer<String> b = new Consumer<String>() {};
		Consumer<String> b = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t+"!!");
				
			}};
			
			
			b.accept("인터페이스 구현 익명클래스");
			
			Consumer<String> c= (item)->{System.out.println(item+"@@");};
			c.accept("인터페이스 구현 람다식");
			
			
			Consumer<String> d = (item) -> System.out.println(item);
			d.accept("인터페이스 구현 람다식, 생략형");
			
			// 매서드 참조(람다식을 더 줄인 형태)
			Consumer<String> f = System.out::println;
			d.accept("인터페이스 구현 매서드 참조 방식");
			
			
			
			
	}

}
