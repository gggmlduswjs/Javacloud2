package day4.prac.reflect;

public class Acorn {
	
	String name;
	int age;
	public Acorn(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Acorn() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", age=" + age + "]";
	}
	
	// ## 매서드 하나 추가
	public void printMyInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	

}
