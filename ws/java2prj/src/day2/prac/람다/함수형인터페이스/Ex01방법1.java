package day2.prac.람다.함수형인터페이스;

class AddInterfaceImp implements AddInterface {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
}


public class Ex01방법1 {

	public static void main(String[] args) {
		
		AddInterfaceImp a = new AddInterfaceImp();
		int result =a.add(5, 3);
		
		System.out.println(result);
	}
	
	
}
