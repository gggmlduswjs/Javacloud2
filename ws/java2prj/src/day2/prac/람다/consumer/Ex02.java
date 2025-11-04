package day2.prac.람다.consumer;

import java.util.function.Consumer;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 입력이 있고 반환이 없는 것, 입력(매개변수)를 사용만 하는 매서드 작성하기
		Consumer<Integer> a = (dfdf) -> {
			
			System.out.println("콩나물 사기");
			dfdf -= 1000;
			dfdf -= 100;
			
			System.out.println("잔액" + dfdf);
		};
		
		
		a.accept(30000);
		
		// 클래스
		class A implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				
				System.out.println(t);
				
				t -= 1000;
				t -= 2000;
				t -= 10000;
				
				System.out.println("잔액"+t);
				
				
				
			}
			
		}
		
		Consumer<Integer> b=new A();
		
		b.accept(30000);
		
		
		// 익명
		
		
		
		Consumer<Integer> c= new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("바지 구매");
				t -= 1000000;
				System.out.println("자켓 구매");
				t -= 2000000;
				
				System.out.println(t);
			}
			
		};
		
		c.accept(10000000);
		
		
		
	}

}
