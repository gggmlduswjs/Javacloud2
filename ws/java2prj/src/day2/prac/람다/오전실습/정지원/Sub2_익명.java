package day2.prac.람다.오전실습.정지원;

public class Sub2_익명 {
	public static void main(String[] args) {
		SubInterface sub2 = new SubInterface() {
			
			@Override
			public int sub(int num1, int num2) {
				return num1 - num2;
			}
			
		};
		int result = sub2.sub(20, 10);
		System.out.println(result);
	}
}
