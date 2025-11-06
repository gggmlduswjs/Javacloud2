package day4.prac.reflect;

public class 객체생성하기3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		// 2. 객체로부터 클래스 정보 얻어오기
		Acorn acorn = new Acorn();
		
		Class clazz = acorn.getClass();
		
		Acorn acorn2 =(Acorn)clazz.newInstance();
		
		System.out.println(acorn2);
		acorn.printMyInfo();

	}

}
