package day2.prac.람다.consumer;


/*
 * public interface MyConsumer0 {
	
	public void accept(Object o);

}

 * */

public class MyConsumer0구현하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConsumer0 a = (t) -> {System.out.println(t);};
		
		// 매개변수 한 개인 경우 괄호 생략 가능
		// 실행할 코드가 한 줄인 경우는 중괄호 블럭 생략 가능
		
		MyConsumer0 b = t ->System.out.println(t+"^^");
		
		a.accept("안녕");
		
		b.accept("안녕");
		
		
		MyConsumer0 c = (t) ->{
			
			Acorn acorn = (Acorn)t;
			
			System.out.println(acorn.getName());
			
		};
		
		c.accept(new Acorn("acorn1","손민영"));
		
		// 1. 클래스
		class A implements MyConsumer0{

			@Override
			public void accept(Object o) {
				
				Acorn acorn = (Acorn) o;
				System.out.println(acorn.getName());
				
			}
			
		}
		
		MyConsumer0 d = new A();
		d.accept(new Acorn("acorn2","우동훈"));
		
		
		
		// 2. 익명
		
		MyConsumer0 e = new MyConsumer0() {

			@Override
			public void accept(Object o) {
				Acorn acorn =(Acorn) o;
				System.out.println(acorn);
				
			}
			
		};
		
		
		e.accept(new Acorn("acorn3","이혜린"));
		
		MyConsumer0 f = (item) -> {
			Acorn acorn = (Acorn)item;
			System.out.println(acorn+"^^");
		};
		
		f.accept(new Acorn("acorn4","윤태민"));
		
		
		
	}

}
