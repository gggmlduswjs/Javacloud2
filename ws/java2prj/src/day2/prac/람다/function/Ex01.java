package day2.prac.람다.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/*
 * interface Function<T,R> {
 * 	public R apply(T t);
 * 
 * }
 * 
 * */

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		//
		Function<Integer,int[]> f=(t)->{
			
			int [] arr = {1,6,8,t};
			
			return arr;
		
		};
		
		
		int [] result =f.apply(7);
		
		System.out.println(Arrays.toString(result));
		
		
		// 숫자 -> 약수정보 
		// 숫자 -> 화폐매수
		
		
		Function<Integer, int[]> f2 =(num) -> {
			
			System.out.println(num);
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=1; i<=num;i++) {
				
				if(num% i ==0) {
					list.add(i);
				}
			}
			
			
			// ArrayList<Integer> -> int [] 변환
			
			int[] arr = new int[list.size()];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = list.get(i);
			}
			
			return arr;
			
			
			
			
		};
		
		
		int[] resultarr = f2.apply(20);
		
		System.out.println(Arrays.toString(resultarr));
		
		
		// 생략가능
		Function<Integer, Integer> f3=(money) -> {return money*2;};
		
		
		int resultMoney = f3.apply(300);
		System.out.println(resultMoney);
		
		// 익명
		Function<Integer, Integer> f4 = new Function<Integer, Integer> () {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}
			
			
		};
		
		
		
		int resultMoney2 =f4.apply(2000);
		
		System.out.println(resultMoney2);
		
		
		
		// 클래스 직접
		
		class A implements Function<Integer, Integer>{

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*3;
			}
			
		}
		
		Function<Integer, Integer> f5 = new A();
		int resultMoney3 =f5.apply(2000);
		
		
		System.out.println(resultMoney3);
		
		
		
		
		
	}

}
