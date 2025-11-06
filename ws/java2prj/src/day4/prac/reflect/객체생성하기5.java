package day4.prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기5 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class clazz =Class.forName("day4.prac.reflect.Acorn");
		
		Constructor c=clazz.getDeclaredConstructor();	//기본생성자
		
		Acorn acorn=(Acorn)c.newInstance();
		System.out.println(acorn);
		
		// 매개변수 있는 생성자를 통해서 객체 생성하기
		
		Class clazz2=Class.forName("day4.prac.reflect.Acorn");
		Constructor c2= clazz2.getDeclaredConstructor(String.class ,int.class );
		Acorn acorn2=(Acorn) c2.newInstance("김길동",26);
		
		acorn2.printMyInfo();
		
		// @Component => 스프링에서 스프링이 객체를 생성해줌(기본생성자)
		

	}

}
