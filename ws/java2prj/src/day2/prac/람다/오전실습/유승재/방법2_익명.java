package day2.prac.람다.오전실습.유승재;

public class 방법2_익명 {

	public static void main(String[] args) {
		
		CalculatorInterface cal = new CalculatorInterface() {
			
			@Override
			public int cal(int num1, int num2) {
				
				return num1 / num2;
			}
		};
		int result = cal.cal(353, 3);
		
		System.out.println(result);
	}
}
