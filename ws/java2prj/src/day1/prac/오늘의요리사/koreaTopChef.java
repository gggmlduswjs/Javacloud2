package day1.prac.오늘의요리사;

public class koreaTopChef extends Cook implements 한식가능한{
	
	public koreaTopChef() {
		super();
	}

	public koreaTopChef(String name) {
		super(name);
	}
	
	@Override
	public String 비빔밥만들기() {
		return "제육볶음덮밥 4인분";
	}
}
