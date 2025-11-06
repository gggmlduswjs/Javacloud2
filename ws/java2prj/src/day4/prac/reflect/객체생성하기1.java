package day4.prac.reflect;

public class 객체생성하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acorn acorn = new Acorn("홍길동",25);	//객체생성, 변수덩어리 만들어짐
		// 객체를 생성한 이유부터 출력가능 -> 데이터가 있어야 출력가능하기 때문에
		acorn.printMyInfo();

	}

}
