package day4.prac.계산기;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class 계산기프로그램6 {
	
	Calculator cal;	//인터페이스에 의존하기
	
	// 주입받는 방법
	// 1. 생성자 주입
	public 계산기프로그램6(Calculator cal) {
		super();
		this.cal = cal;
	}

	
	public void run() {
			
			//
			Scanner sc= new Scanner(System.in);
			int su1=sc.nextInt();
			int su2=sc.nextInt();
			
			//
			int result=cal.add(su1, su2);
			
			// 
			System.out.println(result);
			
			
		}
	
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 생성할 클래스 정보 읽어오기
		// 설정파일 읽어오기 - Properties 라이브러리
		Properties pp=new Properties();
		pp.load(new FileReader("src/day4/prac/계산기/config.txt"));
		String className=pp.getProperty("Calculator");
		System.out.println(className);
		
		Class clazz=Class.forName(className);
		Calculator calculator=(Calculator) clazz.newInstance();
		
		계산기프로그램6 p=new 계산기프로그램6(calculator);
		p.run();
		
		
	}

}
