package day2.prac.람다.오전실습.김민희;

public class ex {

	 static class  Myclass implements MyInterface{
		@Override
		public void my() {
			System.out.println("일반클래스 구현");
		}
	 }
	 
	 public static void main(String[] args) {
		 
		 //1.일반클래스
		 MyInterface a = new Myclass();
		 a.my();
		 
		 //2.익명클래스
		 MyInterface b = new MyInterface() {
			
			@Override
			public void my() {
				System.out.println("익명클래스 구현");
			}
		 };
		 b.my();
		
		 //3.람다식
		 MyInterface c = () -> System.out.println("람다식 구현");
		 c.my();
	 }
}
