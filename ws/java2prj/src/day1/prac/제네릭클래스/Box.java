package day1.prac.제네릭클래스;


// 제네릭 Box 만들기
// 다이아몬드 연산자
// 타입변수


public class Box<T> {
	
	T a;
	
	//
	
	public void setT(T a) {
		this.a= a;
		
		
	}
	
	public T getT() {
		return a;
	}

}
