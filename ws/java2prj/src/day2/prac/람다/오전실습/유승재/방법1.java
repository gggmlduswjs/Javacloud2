package day2.prac.람다.오전실습.유승재;


class CalImp implements CalculatorInterface {

	@Override
	public int cal(int num1, int num2) {
		
		return num1 * num2;
	}
	
}


public class 방법1 {

	public static void main(String[] args) {
		
		CalculatorInterface cal = new CalImp();
		
		int result = cal.cal(7, 98);
		
		System.out.println(result);
	}
}
