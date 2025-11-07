package day5.prac.애너테이션실습;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Food리스트검증하기 {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		
		List<Food> foodList  = new ArrayList<>();
		List<Food> dietList =  new ArrayList<>();
		
		foodList.add( new Food("비빔밥" ,530));
		foodList.add( new Food("샐러드" ,270));
		foodList.add( new Food("어묵" ,180));
		foodList.add( new Food("돈까스" ,480));
		foodList.add( new Food("우동" , 180));
		
		
		for(Food food : foodList) {
			boolean result =검증하기(food);
			if(result == true) {
				dietList.add(food);
			}
		}
		
		// 다이어트 목록
		dietList.forEach(item -> System.out.println(item));
		
	}

	private static boolean 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		// ? ?extends Object
		// 	 ?extends Food
		Class<?> clazz =food.getClass();
		
		
		Field field =clazz.getDeclaredField("calroie");
		// 애너테이션설정
		// 실제값
		MAXCalorie annotation =field.getAnnotation(MAXCalorie.class);
		
		int 설정값=annotation.value();
		int 실제값 =(int)field.get(food);
		
		
		if(실제값 > 설정값) {		// 
			return false;	// 다이어트 식품 x
		}else {
			return true;	// 다이어트 식품 o
		}
		
		
		
		
		
		
		
	}

}
