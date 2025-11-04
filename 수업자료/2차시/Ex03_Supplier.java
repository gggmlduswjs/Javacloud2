package day2prac.실습과제;

import java.util.function.Supplier;

public class Ex03_Supplier {

	public static void main(String[] args) {
		
		//1)
		class A implements Supplier<String>{

			@Override
			public String get() {
				Recipe r = new Recipe("김치볶음밥", "김치, 밥, 참기름");
				System.out.println(r.toString());
				return r.getName();
			}
		}
		
		Supplier<String> a = new A();
		String name =  a.get();
		System.out.println("요리명 : " + name);
		
		
		//2)익명
		Supplier<String> b = new Supplier<String>() {
			
			@Override
			public String get() {
				Recipe r = new Recipe("김치볶음밥", "김치, 밥, 참기름");
				System.out.println(r.toString());
				return r.getName();
			}
		};
		String name2 = b.get();
		System.out.println("요리명 : " + name2);
		
		
		//3)람다
		Supplier<String> c = () -> {
			Recipe r = new Recipe("김치볶음밥", "김치, 밥, 참기름");
			System.out.println(r.toString());
			return r.getName();
		};
		
		String name3 = c.get();
		System.out.println(name3);
	}

}
