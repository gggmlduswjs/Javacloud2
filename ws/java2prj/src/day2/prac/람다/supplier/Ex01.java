package day2.prac.람다.supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

import day2.prac.람다.consumer.Acorn;



/*
 * interface Supplier<T> {
 * 	public T get();
 * }
 * 
 * */

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		Supplier<Integer> a = () -> {return 5000000;};
		
		
		int result = a.get();
		
		System.out.println(result);
		
		
		Supplier<Integer> b=() -> 7000000;
		int result2 = b.get();
		System.out.println(result2);
		
		
		Supplier<Acorn> c= () ->{return new Acorn("acorn7","김민희");};
		
		Acorn result3 = c.get();
		System.out.println(result3);
		
		Supplier<String[]> d=() -> {
			String[] likes = {"사과", "메론", "블루베리"};
			return likes;
			
			
		};
		
		String[] result4=d.get();
		
		System.out.println(Arrays.toString(result4));
		
		
		Supplier<ArrayList<String>> e =() -> {
			ArrayList<String> list = new ArrayList<>();
			list.add("사과");
			list.add("딸기");
			
			return list;
			
		};
		
		ArrayList<String> result5 = e.get();
		System.out.println(result5);
		
		
		// 익명
		
		
		Supplier<Integer> f = new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 300000;
			}};
			
			
		int result7= f.get();
		
		
		System.out.println(result7);
		
		// 클래스
		
		
		class A implements Supplier<Integer>{

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 500000;
			}
			
		}
		
		
		Supplier<Integer> g= new A();
		int result8= g.get();
		System.out.println(result8);
		
	}

}
