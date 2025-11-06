package day4.prac.계산기;

import java.util.Scanner;

public class 계산기프로그램0 {

	//
	public void run() {
		// 사용자에게 두 수를 입력
		// 두 수의 더한 결과
		// 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하시오,계산해드리겠습니다");
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		// 계산하기
		int result = su1+su2;
		
		// 출력하기
		System.out.println(result+"입니다");
		
		
		
	}
	
	public static void main(String[] args) {
		
		계산기프로그램0 program = new 계산기프로그램0();
		program.run();
	}

}
