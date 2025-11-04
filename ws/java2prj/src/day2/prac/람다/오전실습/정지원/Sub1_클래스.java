package day2.prac.람다.오전실습.정지원;

class SubInterface1 implements SubInterface{

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
}

public class Sub1_클래스 {
	public static void main(String[] args) {
		SubInterface sub1 = new SubInterface1();
		int result = sub1.sub(10, 4);
		
		System.out.println(result);
	}
}
