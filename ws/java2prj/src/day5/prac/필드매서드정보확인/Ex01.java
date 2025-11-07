package day5.prac.필드매서드정보확인;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex01 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Store store = new Store(3, 5);
		
		
		// 객체로부터 클래스 정보 얻어오기
		
		// 와일드 카드 문자 : 제네릭객체참조를 유연하게 받을 때 사용함
		// <Store>
		// <?> : ? extends Object
		// <? super T>
		// <? extends T>
		Class<?> clazz =store.getClass();
//		Class clazz =store.getClass();
		
		// 선언된 필드 정보 가져오기
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
			System.out.println(field.get(store));
			field.set(store,10);
		}
		
		
		System.out.println(store);
		
		
		//매서드정보 확인하기
		
		
		//Store가 정의한 클래스
		Method[] methods =clazz.getDeclaredMethods();	// 주체 -> 매서드(객체의 정보가 전달되어야 함)
		
		
		for(Method method : methods) {
			System.out.println(method);
		}
		
		
		Method[] methodsAll =clazz.getMethods();
		
		for(Method method : methodsAll) {
			System.out.println(method);
		}
		
		// 매서드정보(매서드객체)를 통해서 매서드 호출하기
		
		Method getAppleMethod =clazz.getDeclaredMethod("getApple");
		
		// 매서드객체를 통해서 호출하기
		Object cnt =getAppleMethod.invoke(store);
		
		System.out.println(cnt);
		
		
		int cnt2= store.getApple();	//getApple() 호출될 때 객체(store)의 정보가 전달된다. getApple(store)
		System.out.println(cnt2);
		
		
		
	}

}
