package day2.prac.람다.오전실습.박두식;

class Multi implements MyRunnable_PDS{
	@Override
	public void run(int a, int b) {
		int result=a*b;
		System.out.println(a+" 곱하기 "+b+"는 "+result+" 입니다.");
	};
}


public class Prac01nameClass {
	public static void main(String[] args) {
		MyRunnable_PDS multi=new Multi();
		multi.run(5, 2);
	}
}
