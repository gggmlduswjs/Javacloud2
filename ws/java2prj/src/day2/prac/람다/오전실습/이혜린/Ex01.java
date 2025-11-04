package day2.prac.람다.오전실습.이혜린;



class CompareInterfaceImp implements CompareInterface{

	//최대값
	@Override
	public int compare(int num1, int num2) {
		
		return Math.max(num1, num2); 
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		
		//1)
		CompareInterfaceImp c1 = new CompareInterfaceImp();
		int result = c1.compare(10, 5);
		System.out.println("최대값 : " + result);
		
		
		
		//2)익명 클래스
		CompareInterface c2 = new CompareInterface() {
			
			@Override
			public int compare(int num1, int num2) {
				return Math.max(num1, num2);
			}
		};
		
		int result2 = c2.compare(10, 5);
		System.out.println("최대값 : " + result2);
		
		
		
		//3)람다식
		CompareInterface c3 = (num1, num2) -> Math.max(num1, num2);
		int result3 = c3.compare(10, 5);
		System.out.println("최대값 : " + result3);
		
		
	}

}
