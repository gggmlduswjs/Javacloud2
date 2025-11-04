package day2prac.실습과제;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex04_Predicate {

	public static void main(String[] args) {


		// 3)
		Predicate<String> a = (name) -> {
			Recipe r = new Recipe("김치볶음밥", "김치, 밥, 참기름");
			return name.equals(r.getName());
		};

		
		Supplier<String> ss = () -> {
			return "김치볶음밥";
		};

		
		// boolean result = a.test("김치볶음밥");
		String food = ss.get();
		boolean result = a.test(food);
		boolean result2 = a.test("라면");

		System.out.println(result);
		System.out.println(result2);

	}

}
