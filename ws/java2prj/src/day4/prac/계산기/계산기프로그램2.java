package day4.prac.계산기;

import java.util.Scanner;

public class 계산기프로그램2 {
	
	삼성계산기 cal =new 삼성계산기();	//의존성 Dependency
	
	
	
	public void run() {
		Scanner sc= new Scanner(System.in);
		
		//
		System.out.println("두 수 입력");
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		// 계산기라이브러리 사용, LG계산기 사용- LG계산기 의존하기	(멤버로 사용하는 것을 의존하기)
		int result=cal.add삼성(su1, su2);
		
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		
		
		계산기프로그램2 p=new 계산기프로그램2();
		p.run();
	}

}
