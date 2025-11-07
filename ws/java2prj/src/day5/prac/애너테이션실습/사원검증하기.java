package day5.prac.애너테이션실습;

import java.lang.reflect.Field;
import java.util.Arrays;

public class 사원검증하기 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Employee e = new Employee("전희연","Tuesday");	// 쉬는 날 목록에서 검증 실패
		
		검증하기(e);
	}

	private static void 검증하기(Employee e) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		//클래스 정보 얻기
		Class clazz=e.getClass();
		
		//필드 정보 가져오기
		
		for(Field field :clazz.getDeclaredFields()) {
			
			// 쉬는요일에 관련된 애너테이션 정보 가져오기
			// 실제값
			
			WeekDaysAvail annotation =field.getAnnotation(WeekDaysAvail.class);
			
			if(annotation != null ) {
				
				
				// 애너테이션의 설정값 : String[]
				
				// 실제값
				String 실제쉬는날 = (String) field.get(e);
				
				String[] 설정된값 =annotation.value();
				
				System.out.println(Arrays.toString(설정된값));
				System.out.println(실제쉬는날);
				
				
				boolean flag=false;
				
				for(String day: 설정된값) {
					if(day.equals(실제쉬는날)) {
						flag=true;
						
					}
				}
				
				//
//				if(flag == true) {
				if(flag) {	
					System.out.println("쉴 수 있다");
					
				}else {
					System.out.println("쉴 수 없다");
				}
				
				}
			
		};
		
	}

}
