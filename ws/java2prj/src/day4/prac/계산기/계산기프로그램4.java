package day4.prac.계산기;

import java.util.Scanner;

public class 계산기프로그램4 {
	
	//
	Calculator cal;	//직접 생성하지 않는다. 외부로부터 생성된 객체를 주입받겠다 Injection(주입)
	
	// 주입방법 1. 생성자주입
	// 주입방법 2. setter주입
	
	
	// 생성자주입
	public 계산기프로그램4(Calculator cal) {
	
		this.cal = cal;
	}
	
	
	
	
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		int result=cal.add(su1, su2);
		
		System.out.println("결과"+result);
	}
	
	
	
	



	
	public static void main(String[] args) {
		계산기프로그램4 p=new 계산기프로그램4(new KaKa계산기());
		p.run();
	}

}
