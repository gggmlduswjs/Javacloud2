package day2.prac.람다.오전실습.박두식;

public class Prac02AnonymousClass {
	public static void main(String[] args) {
		MyRunnable_PDS minus=new MyRunnable_PDS(){
			
			@Override
			public void run(int a, int b) {
				int result = a-b;
				System.out.println(a+" 빼기 "+b+"는 "+result+" 입니다.");
			}

		};
		minus.run(11, 5);
	}

}
