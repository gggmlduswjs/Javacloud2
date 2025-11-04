package day2prac.실습과제;

import java.util.Random;
import java.util.function.Function;

public class Ex05_Function {

	public static void main(String[] args) {
		
		//수의 제곱
		//2)
		Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer su) {
				return su * su;
			}
		}; 
		
		int result = f1.apply(40);
		System.out.println(result);
		
		//3)
		Function<Integer, Integer> f2 = (su) -> su * su;
		int result2 = f2.apply(50);
		System.out.println(result2);
		
		
		//난수 반환
		Random random = new Random();
		//2)
		Function<Integer, Integer> f3 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return random.nextInt(t);
			}
		};
		
		int result3 =  f3.apply(10);
		System.out.println("난수 : " +  result3);
		
		//3)
		Function<Integer, Integer> f4 = (t) -> random.nextInt(t);
		int result4 = f4.apply(20);
		System.out.println("난수 : " + result4);
	}

}
