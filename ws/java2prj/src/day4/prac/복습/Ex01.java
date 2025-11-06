package day4.prac.복습;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex01 {

	public static void main(String[] args) {
		 
		
		//함수형인터페이스 
		
		
		//5개 
		
		// public void run();
		
		//익명클래스의 익명객체가 생성됨 
		
		
		
		// Runnable - 실행만 하는 매서드, void run() - 추상 매서드
		Runnable r  = ()->{
			
			System.out.println("내일이 금요일  ^^");
		};

		
		//run() 만 가진 인터페이스 
		r.run();
		
		
		
		Runnable r2 = new Runnable() {

		@Override
		public void run() {
			 
			System.out.println("내일이 금요일  ^^");
		}};
		
		
		
			
		r2.run();
			
			
			
	  
		
	   
		// Supplier<T> - 값을 제공하는 함수 , 매개변수 x, 반환값 o
	    // T  get ( )-추상 매서드;
		Supplier<Integer>  s  = () -> { return  200000000;};  
		
		
		int money = s.get();
		
		System.out.println( money);
		
		
		
		
		
		// Consumer<T> - 입력을 소비하는 함수, 매개변수o, 반환값 x
		// void accept (  T  t) - 추상 매서드;
		Consumer<Integer> c = ( a)->{
			
			a-=1000000;
			a-=2000000;
			a-=3000000;
			
			System.out.println( "잔액:"+ a);
			
		};
		 
		
		// money = 200000000가 입력됨 
		c.accept(money);
		
		
		// Predicate<T> – 조건을 검사하는 함수, 입력값 하나 -> boolean 반환, 조건식을 함수로 만드는 것 
		// boolean test( T  t)- 추상 매서드;
		Predicate<Integer>  p = ( num)->{  
			
			boolean result;
			if(num %2==0) {
				result=true;
			}else {
				result=false;
			}
			return result;
		};
		
		
		
		boolean rtn1 = p.test(11);
		boolean rtn2 = p.test(10);
		
		
		System.out.println( rtn1);
		System.out.println( rtn2);
		
		
		
		// R  apply( T  t)
		//Function
		
		//        입력    , 반환의 타입
		Function<Integer, ArrayList<String>> f =( su  )->{
			
			ArrayList<String> list  = new ArrayList<>();
			list.add("하이");
			list.add("바이");
			list.add(  String.valueOf(su));
			
			return list;
		};
		
		
		ArrayList<String>  result  =f.apply(5);		
		System.out.print(result);
		
		
		
		
		
		
	}

}
