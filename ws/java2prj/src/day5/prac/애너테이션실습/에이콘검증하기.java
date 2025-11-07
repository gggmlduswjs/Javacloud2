package day5.prac.애너테이션실습;

import java.lang.reflect.Field;

public class 에이콘검증하기 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		
		// 3 14		, max 이내면 성공
		Acorn acorn = new Acorn("전희연","010-5429-6196");
		
		검증하기(acorn);

	}
	
	
	public static void 검증하기(Object obj) throws IllegalArgumentException, IllegalAccessException {
		
		//
		Class clazz =obj.getClass();
		
		//
		for(Field field : clazz.getDeclaredFields()) {
			MAXLen annotation= field.getAnnotation(MAXLen.class);
			
			//
			if(annotation != null) {
				
				// 애너테이션의 값
				// 실체값 확인
				
				String 실제값 =(String) field.get(obj);		// 이름, 전화 String 
				int 애너테이션설정값=annotation.length();
				
				// "우주연" 3 	"010-5429-6196"
				
				System.out.println(실제값);
				System.out.println(애너테이션설정값);
				
				if( 실제값.length() <= 애너테이션설정값) {
					System.out.println();
				}else {
					
				}
				
			}
		}
		
	}

}
