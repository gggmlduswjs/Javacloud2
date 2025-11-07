package day5.prac.애너테이션실습;

import java.lang.reflect.Field;

public class 검증하기 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		
		// 5	3	1
		FruitStore f = new FruitStore(5,3,2);
		
		필드검증하기(f) ;

	}
	
	public static void 필드검증하기(Object obj) throws IllegalArgumentException, IllegalAccessException {
		
		// 클래스 정보 얻어오기
		Class clazz =obj.getClass();
		
		// 필드정보가져오기
		
		Field[] fields =clazz.getDeclaredFields();
		
		for(Field field : fields) {
			
			Count annotation=field.getAnnotation(Count.class); // 해당 애너테이션이 없으면 null 반환
			
			if(annotation != null) {
				
				field.setAccessible(true);	// private이어도 접근이 가능하다
				// 애너테이션의 설정 값 가져오기
				// 실제 필드의 값 가져오기
				
				int 기대하는값= annotation.value();	//애너테이션에 설정한 값
				
				int value =(int)field.get(obj);
				
				System.out.println("애너테이션="+기대하는값);
				System.out.println("실제객체값="+value);
				
				if(기대하는값 !=value) {
					System.out.println(field.getName()+"실패");
					
				}else {
					System.out.println("성공");
				}
			}
		}
		
	}

}
