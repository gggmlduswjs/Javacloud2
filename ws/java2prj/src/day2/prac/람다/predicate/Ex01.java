package day2.prac.람다.predicate;

import java.util.function.Predicate;

/*
 * intereface Predicate<T> {
 * 	public boolean test(T t)
 * }
 * 
 * */

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		//
		
		Predicate<String> a = (item ) -> {
		
			boolean result;
			result = item.equals("떡볶이");
			
			return result;
		
		
		};
		
		boolean result= a.test("떡볶이"); 	// true
		boolean result2= a.test("떡볶이3"); // false
		
		System.out.println(result);
		
		System.out.println(result2);
		
		Predicate<Integer> b=(t) -> {
			boolean rtn = t%2==0;
			return rtn;
		};
		
		
		boolean result3 = b.test(10);
		boolean result4=b.test(11);
		
		System.out.println(result3);	
		System.out.println(result4);
		
		
		// 클래스
		
		class A implements Predicate<Integer> {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				boolean r=t%2==0;
				return r;
			}
			
		}
		
		Predicate<Integer> aa = new A();
		boolean gg= aa.test(14);
		
		System.out.println(gg);
		
		
		// 익명
		Predicate<Integer> kk = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				boolean r=t%2==0;
				return r;
			}
			
		};
		
		boolean result9 = kk.test(11);
		System.out.println(result9);
		
		

	}

}
