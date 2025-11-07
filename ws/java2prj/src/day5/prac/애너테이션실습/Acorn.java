package day5.prac.애너테이션실습;

public class Acorn {
	@MAXLen(length=3)	// length 이름은 생략할 수 없다.
	String name;
	
	@MAXLen(length=14)
	String tel;
	
	//생성자
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	public Acorn(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	//toString
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	

}
