package day2.prac.람다.오전실습.윤태민;

class MultiInterfaceImp implements MultiInterface{

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiInterface m = new MultiInterfaceImp();
		
		for(int i=1; i<10; i++) {
			int result = m.multi(2, i);
			
			System.out.println("2 X " + i + "=" + result);
		}

	}

}
