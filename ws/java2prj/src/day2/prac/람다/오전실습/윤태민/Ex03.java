package day2.prac.람다.오전실습.윤태민;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiInterface m = (a,b) -> {return a * b;};
		
		for(int i=1; i<10; i++) {
			
			int result = m.multi(2, i);
			
			System.out.println("2x" + i + "=" + result);
		}

	}

}
