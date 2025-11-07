package day5.prac.애너테이션실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLib애너테이션사용하기 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		MyLib lib = new MyLib();
		
		검증하기(lib);

	}

	private static void 검증하기(MyLib lib) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		
		Class clazz =lib.getClass();
		
		Method method =clazz.getDeclaredMethod("printStar");
		
		// 매서드 호출하기
		
		BeforeAndAfter annotation = method.getAnnotation(BeforeAndAfter.class);
		
		if(annotation !=null) {
			String before=annotation.before();
			String after = annotation.after();
			
			System.out.println(before);
			// 호출 전
			method.invoke(lib);
			// 호출 후
			System.out.println(after);
			
		}
		
		
	}

}
