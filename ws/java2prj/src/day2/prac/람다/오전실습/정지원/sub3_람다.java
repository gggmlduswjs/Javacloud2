package day2.prac.람다.오전실습.정지원;

public class sub3_람다 {
	public static void main(String[] args) {
		SubInterface sub3 = (num1, num2) -> num1 - num2;
		
		int result = sub3.sub(100, 20);
		System.out.println(result);
	}
}
