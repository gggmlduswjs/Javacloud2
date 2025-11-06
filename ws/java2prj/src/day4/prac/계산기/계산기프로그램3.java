package day4.prac.계산기;

import java.util.Scanner;

public class 계산기프로그램3 {
	Calculator cal = new KaKa계산기();	//직접생성하기, 계산기프로그램3이 생성될 때 같이 생성됨
	
	public void run() {
		
		// Scanner 준비
		// 두 수 입력
		//
		Scanner sc=new Scanner(System.in);
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		
		//계산하기
		int result = cal.add(su1, su2);
		
		
		
		
		//출력하기
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		계산기프로그램3 p=new 계산기프로그램3();
		p.run();

	}

}
