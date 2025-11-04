package day2.prac.람다.오전실습.박두식;

public class Prac03LambdaClass {
	public static void main(String[] args) {
		
		
		
		MyRunnable_PDS pluse= (a, b)->{
			int result = a+b;
			System.out.println(a+" 더하기 "+b+"는 "+result+" 입니다.");
		};
		pluse.run(3, 4);
	}
}
