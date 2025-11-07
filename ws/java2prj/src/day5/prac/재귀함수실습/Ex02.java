package day5.prac.재귀함수실습;

public class Ex02 {
	
	// 기능명
		// 입력(매개변수)
		// 반환
		
		
		// 기능 : 1~5까지의 합
		// 입력 : x
		// 반환 : 1~5까지의 합
		
		public static int getTotalFive() {
			
			int sum=0;	// 출력변수
			for(int i=1;i<=5;i++) {
				sum = sum+i;
			}
		
			
			
			
			return sum;
			
		}
		
		
		public static void main(String[] args) {
			
			
			int result= Ex02.getTotalFive();
			System.out.println(result);
			
		}

}
