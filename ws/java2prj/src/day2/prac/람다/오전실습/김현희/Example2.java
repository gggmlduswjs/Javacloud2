package day2.prac.람다.오전실습.김현희;

public class Example2 {

	public static void main(String[] args) {
		// 1.
		AInterfaceImp imp1 = new AInterfaceImp();
		
		int result1 = imp1.a(11);
		
		//2. 익명클래스
		AInterfaceImp imp2 = new AInterfaceImp() {
			
			@Override
			public int a(int su1) {
				
				return su1 + 1;
			}
			
			
		};
		int result2 = imp2.a(26);
		
		
		//3.람다식
		
		AInterface imp3 = (a) -> a+1;
		int result3 = imp3.a(33);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	
	}
	
	
	
}
