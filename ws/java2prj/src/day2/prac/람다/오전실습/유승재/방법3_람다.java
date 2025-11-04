package day2.prac.람다.오전실습.유승재;

public class 방법3_람다 {

	public static void main(String[] args) {

		CalculatorInterface cal = (num1, num2) -> {return num1 % num2;};

		int result = cal.cal(534, 12);
		
		System.out.println(result);
		
		CalculatorInterface cal2 = (num1, num2) -> num1-num2;
		
		int result2 = cal2.cal(4531, 24543);
		
		System.out.println(result2);
	}

}
