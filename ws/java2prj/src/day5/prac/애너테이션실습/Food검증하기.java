package day5.prac.애너테이션실습;

import java.lang.reflect.Field;

public class Food검증하기 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Food food = new Food("비빔밥" , 530);
		
		검증하기(food);

	}

	private static void 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// 객체의 클래스 정보 가져오기
		Class clazz =food.getClass();
		
		// 필드정보 가져오기
		Field field = clazz.getDeclaredField("calroie");
		
		// 애너테이션정보 가져오가
		
		MAXCalorie annotation =field.getAnnotation(MAXCalorie.class);
		int 설정된값 =(int)annotation.value();	// 290
		int 실제푸드객체의칼로리=(int)field.get(food);	// 530
		
		
		// 실제값과 비교하기
		
		System.out.println(설정된값);
		System.out.println(실제푸드객체의칼로리);
		
		
		
		if(실제푸드객체의칼로리 > 설정된값) {
			System.out.println("다이어트 식품 아닌");
		}else {
			System.out.println("다이어트 식품^^");
		}
		
		
		// 성공 실패
		
		
		
	}

}
