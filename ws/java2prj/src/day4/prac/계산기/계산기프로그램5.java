package day4.prac.계산기;

import java.util.Scanner;

public class 계산기프로그램5 {
	
	Calculator cal;	//참조형변수의 기본값은 null
	
	// 객체참조를 주입받는 방법을 사용함
	// setter 주입
	public void setCal(Calculator cal) {
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
	
	

	public static void main(String[] args) {
		
		계산기프로그램5 p=new 계산기프로그램5();	//생성자
//		p.setCal(new 다이소계산기());
		p.setCal(new KaKa계산기());
		p.run();
		
		
	}

}
