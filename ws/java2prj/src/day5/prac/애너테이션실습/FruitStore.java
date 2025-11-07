package day5.prac.애너테이션실습;

public class FruitStore {
	
	@Count(value=5)
	private int apples;
	
	@Count(3)	//value라는 이름은 생략가능함
	int bananas;
	
	@Count
	int tomatos;	//default가 있는 경우는 값을 주지 않을 수 있다 

	public FruitStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FruitStore(int apples, int bananas, int tomatos) {
		super();
		this.apples = apples;
		this.bananas = bananas;
		this.tomatos = tomatos;
	}

	@Override
	public String toString() {
		return "FruitStore [apples=" + apples + ", bananas=" + bananas + ", tomatos=" + tomatos + "]";
	}
	
	
	
	
	
	
}
