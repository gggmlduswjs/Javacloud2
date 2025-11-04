package day2prac.실습과제;

import java.util.function.Consumer;

public class Ex02_Consumer {

	public static void main(String[] args) {

		//1)클래스
		class A implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				t -= 15000;
				System.out.println("바지 구매1");
				t -= 20000;
				System.out.println("상의 구매1");
				t -= 15000;
				System.out.println("상의 구매2");
				
				System.out.println("잔액 : " + t + "원");
			}
		}
	
		Consumer<Integer> a = new A();
		a.accept(70000);
		
		
		//2)익명
		Consumer<Integer> b = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				t -= 15000;
				System.out.println("바지 구매1");
				t -= 20000;
				System.out.println("상의 구매1");
				t -= 15000;
				System.out.println("상의 구매2");
				
				System.out.println("잔액 : " + t + "원");
			}
		};
		
		b.accept(70000);
		
		
		//3)람다
		Consumer<Integer> c = (t) -> {
			t -= 15000;
			System.out.println("바지 구매1");
			t -= 20000;
			System.out.println("상의 구매1");
			t -= 15000;
			System.out.println("상의 구매2");
			
			System.out.println("잔액 : " + t + "원");
		};
		
		c.accept(80000);
	}

}
