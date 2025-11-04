package day2.prac.람다.함수형인터페이스;

public class Ex03방법3 {
	
	public static void main(String[] args) {
		
		AddInterface a = (num1,num2) -> {return num1+num2;};
		
		int result= a.add(5, 3);
		System.out.println(result);
		
		AddInterface b = ( su1, su2) -> su1 +su2; // 중괄호 블럭과 return 생략
		
		int result2= b.add(5, 3);
		System.out.println(result2);
		
		
	}

}
