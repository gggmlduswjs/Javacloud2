package day4.prac.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 객체생성하기6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
//		Class clazz =Class.forName("day4.prac.reflect.Acorn");
		
		
		// 생성할 객체의 정보를 외부파일에서 읽어오기
		BufferedReader br= new BufferedReader(	new FileReader("src/day4/prac/reflect/config.txt"));
		
		String line= br.readLine();	//Acorn=day4.prac.reflect.Acorn
		String[] info=line.split("=");
		
		String key=info[0];
		String value=info[1];
		String className = value;
		
		Class clazz =Class.forName(className);
		
		Constructor c=clazz.getDeclaredConstructor();
		Acorn acorn=(Acorn)c.newInstance();
		acorn.printMyInfo();
		//
		
		Constructor c2=clazz.getDeclaredConstructor(String.class , int.class);
		Acorn acorn2=(Acorn)c2.newInstance("최길동",19);
		acorn2.printMyInfo();

	}

}
