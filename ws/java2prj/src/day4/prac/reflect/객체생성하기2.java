package day4.prac.reflect;

public class 객체생성하기2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		// 1. 클래스로부터 클래스 정보를 얻어오기
		
		Class clazz =Acorn.class;
		Acorn acorn = (Acorn)clazz.newInstance();
		acorn.printMyInfo();
		
		

	}

}
