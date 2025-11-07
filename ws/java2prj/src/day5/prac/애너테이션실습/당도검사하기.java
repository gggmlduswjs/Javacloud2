package day5.prac.애너테이션실습;

import java.lang.reflect.Field;

public class 당도검사하기 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Drink drink = new Drink(5);
		
		
		checkSugar(drink);
	

	}

	private static void checkSugar(Drink drink) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		// 클래스 정보 얻기
		Class clazz = drink.getClass();
		
		// 클래스 안에 모든 필드 검사
		Field[] fields =clazz.getDeclaredFields();
				
		for(Field field : fields) {
			
			//해당 필드에 @MaxSugar가 붙어있는지 검사
			if(field.isAnnotationPresent(MaxSugar.class)) {
				
				// @MaxSugar에 지정된 값 읽기
				MaxSugar annotation =field.getAnnotation(MaxSugar.class);
				int maxValue =annotation.value();
				System.out.println(maxValue);
				
				// 
				int value =(int)field.get(drink);
				System.out.println(value);
				
				// 자동 검증
				if(value>maxValue) {
					System.out.println("당분과다");
					
				}else {
					System.out.println("당분부족");
				}
				
				
				
				
			}
			
			
		
			
			
		}
		
		
			
		
	}

	

}
