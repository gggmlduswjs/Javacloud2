package day1.prac.라이브러리만들기;

public class 이대훈2 implements MyRunnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] pizza = { "피자", "도우", "치즈" };

		for (int i = 0; i < pizza.length; i++) {
			System.out.println(pizza[i]);
		}
	}
	
	

}
