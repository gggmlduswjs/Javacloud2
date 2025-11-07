package day5.prac.애너테이션실습;

public class Food {
	
	String name;
	
	@MAXCalorie(value=290)
	int calroie;
	public Food(String name, int calroie) {
		super();
		this.name = name;
		this.calroie = calroie;
	}
	
	// 생성자
	public Food() {
		// TODO Auto-generated constructor stub
	}
	// toString 
	
	

	@Override
	public String toString() {
		return "Food [name=" + name + ", calroie=" + calroie + "]";
	}
	
	

}
