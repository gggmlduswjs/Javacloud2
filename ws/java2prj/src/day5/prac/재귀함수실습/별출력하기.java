package day5.prac.재귀함수실습;




public class 별출력하기 {
	
	// 1. 매서드로 만들기
	
	private static void printStar() {
		for(int i=1;i<=5;i++) {
			
			System.out.print("*");
		}
	}
	
	private static void printStar2() {
		for(int i=1;i<=5;i++) {
			
			System.out.print("*");
		}
	}
	
	// 2. 재귀매서드로 만들기
	
	// 5	4	3	2	1	0
	public static void printStarR(int n) {	// printStarR(5) *
												// printStarR(4) *
		if(n==0)								// printStarR(3) 	*
			return;								// printStarR(2) 		*
		else {									// printStarR(1)			* 
			System.out.print("*");				// printStarR(0)					
			printStarR(n-1);
		}
		
	}
	
	// 별출력하기 (* 하나를 이용해서 5개 출력하기)
	

	public static void main(String[] args) {
		
		
		// 0. 매서드 만들지 않기
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		 
		}
		
		
		printStar();
		System.out.println("\n재귀호출");
		printStarR(5);

	}

	

}
