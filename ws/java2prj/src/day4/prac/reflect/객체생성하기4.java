package day4.prac.reflect;

public class 객체생성하기4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// 클래스 정보를 로드하여 (Class.forName() 사용하기) : 클래스 정보는 패키지를 포함해야 한다
		
		Class clazz =Class.forName("day4.prac.reflect.Acorn");
		
		Acorn acorn = (Acorn)clazz.newInstance();	//기본생성자를 사용함, 기본생성자가 없다면 오류발생
		acorn.printMyInfo();
		

	}

}
