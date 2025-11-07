package day5.prac.애너테이션실습;

public class Drink {
	
	@MaxSugar(10)
	int sugar;

	public Drink(int sugar) {
		super();
		this.sugar = sugar;
	}
	
	public Drink() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Drink [sugar=" + sugar + "]";
	}
	
	

}
