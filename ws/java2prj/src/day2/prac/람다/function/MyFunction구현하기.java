package day2.prac.람다.function;

import java.util.Arrays;

/*
 * public interface MyFunction<T,R> {

	public R apply(T t);
}

 * 
 * */

public class MyFunction구현하기 {
	
	public static void main(String[] args) {
		
		MyFunction<Integer, String> f = (num) -> {
			
			String str = "";
			
			for(int i=1; i<=num; i++) {
				str += "hi^^";
			}
			
			
			
			
			return str;
			
		};
		
		String result =f.apply(5);
		
		
		System.out.println(result);
		
		
		class A implements MyFunction<Integer, String[]> {

			@Override
			public String[] apply(Integer t) {
				// TODO Auto-generated method stub
				
				String[] arr = new String[t];
				for(int i=0; i<arr.length;i++) {
					arr[i]="hi^^"+(i+1);
					
					
				}
				
				return arr;

			}
			
		}
		
		// 객체생성
		// 생성된 객체의 매서드 호출하기
		MyFunction<Integer, String[]> f4=new A();
		String[] result6= f4.apply(11);
		
		System.out.println(Arrays.toString(result6));
		
		
		for(String str : result6) {
			System.out.println(str);
		}
		
		
		
	}

}
