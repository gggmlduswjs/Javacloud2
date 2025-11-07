package day5.prac.enum실습;

public class Ex01 {

	public static void main(String[] args) {
		// 변수, 상수
		// 숫자 0 : LIGHT, 1 : DARK
		// 문자열 : LIGHT, DARK
		
		
		int mode = 0;	// 0->LIGHT
			// mode =1; ==> DARK
		
		// 가독성 낮고, 0,1 이외의 값이 들어가는 것을 막을 수 없다
		
		// 상수사용하기
		
		
		int mode2= Mode상수.LIGHT;	// 상수사용으로 가독성이 올라감
		mode2=Mode상수.DARK;
		
		//Mode : dark, light 범위 값을 안전하게 저장할 수는 없다
//		mode2=100;
		
		
		// enum 타입 변수로 사용(가독성 + 안전성)
		
		Mode mode3 = null;	// null로 초기화
		
		mode3=Mode.DARK;
		System.out.println(mode3);
		mode3=Mode.LIGHT;
		System.out.println(mode3);
		
//		mode3=1100;	열거형의 나열된 값들만 저장될 수 있음
		
		

	}

}
