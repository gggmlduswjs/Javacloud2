package day1.prac.정렬;

public class this확인하기 {

	public static void main(String[] args) {
		Acorn a = new Acorn("t1","손민영",100);
		Acorn b=new Acorn("t2", "이혜린",1200);
		
		a.compareTo(b);
		//a가 compareTo매서드가 호출될 때 객체의 정보가 전달된다.
	}
}
