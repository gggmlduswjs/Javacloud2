package day01Prac.오늘의요리사;

public class SungbinCook extends Cook implements 일식가능한{
	
	public SungbinCook() {
		super();
	}
	
	public SungbinCook(String name) {
		super(name);
	}
	
	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "군함초밥";
		
	}

}
