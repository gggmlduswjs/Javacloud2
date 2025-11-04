package day2.prac.람다.함수형인터페이스;

public class Ex02방법2 {
	
	public static void main(String[] args) {
		
		// 인터페이스 구현하기 익명
//		AddInterface a = new AddInterface() {};
		
		AddInterface a = new AddInterface() {
			//AddInterface 인터페이스 익명 클래스 만들기 ,오해 금지!!, 인터페이스를 생성하는 코드가 아님

			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}}; 	
			
			
			int result = a.add(5, 3);
			System.out.println(result);
			
			
		
	}

}
