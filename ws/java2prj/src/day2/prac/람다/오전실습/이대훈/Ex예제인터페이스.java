package day2.prac.람다.오전실습.이대훈;

class AddinterfaceImp implements MinusEx {

	@Override
	public int minus(int x, int y) {

		return x - y;
	}

}

public class Ex예제인터페이스 {

	public static void main(String[] args) {

		MinusEx addex = new AddinterfaceImp();

		int result1 = addex.minus(11, 4);

		System.out.println(result1);

		Myrunnable my = new Myrunnable() {

			@Override
			public void run() {
				System.out.println("연습문제익명");
			}
		};
		my.run();

		DivEx div = (a, b) -> a / b;
		int result2 = div.div(100, 2);
		System.out.println(result2);

	}

}
