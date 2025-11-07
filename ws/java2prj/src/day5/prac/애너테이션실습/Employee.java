package day5.prac.애너테이션실습;

public class Employee {
	
	String name;
	
//	@WeekDaysAvail(value={"Monday" , "Wednesday", "Friday"})
	@WeekDaysAvail({"Monday" , "Wednesday", "Friday"})
	String 쉬는요일;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String 쉬는요일) {
		super();
		this.name = name;
		this.쉬는요일 = 쉬는요일;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", 쉬는요일=" + 쉬는요일 + "]";
	}
		
	
	
	
	//생성자
	
	//toString

}
