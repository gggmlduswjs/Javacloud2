package day2.prac.람다.consumer;


/*
 * // 입력이 있고 반환이 없는 것
public interface MyConsumer<T> {
	
	public void accept(T t);

}

 * 
 * */

public class MyConsumer구현하기 {
	
	
	public static void main(String[] args) {
		
		
		MyConsumer<String> a = (t) -> {System.out.println(t+"^^");};
		a.accept("람다식 좋아");
		
		
		MyConsumer<Acorn> b=(dd) -> {System.out.println(dd.getName());};
		
		b.accept(new Acorn("acorn5","이동규"));
		
		
		// 클래스
		class A implements MyConsumer<Integer> {

			@Override
			public void accept(Integer t) {
				
				t-=100;
				System.out.println(t);
				
			}
			
		}
		MyConsumer<Integer> c= new A();
		c.accept(1000);
		
		// 익명
		
		MyConsumer<Integer> d = new MyConsumer<Integer>() {

			@Override
			public void accept(Integer t) {
				t -= 200;
				System.out.println(t);
				
				
				
			}};
			
			
			
			d.accept(1000);
		
		
		
		
	}

}
