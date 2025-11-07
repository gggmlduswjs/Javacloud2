package day5.prac.재귀함수실습;

public class Ex03 {
	
	// 1~n까지의 합 일반매서드로 만들기
	// 1~n까지의 합, 재귀함수로 만들기
	
	public static int getTotal(int n) {
		
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		return sum;
		
	}
	
	
	// 재귀함수로 만들기
	// 탈출조건
	
	public static int getTotalR(int n) {	// 	getTotalR(5)
		if(n ==1)							//			5+getTotalR(4)=> 10
			return 1;						//			4+getTotalR(3)=> 6
		else								//			3+getTotalR(2)=> 3
			return n+getTotalR(n-1);		//			2+getTotalR(1)=> 1
											// 			1 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result =Ex03.getTotal(5);
		System.out.println(result);
		
		int resultR=Ex03.getTotalR(5);	//15
		System.out.println(resultR);
		
	}

}
