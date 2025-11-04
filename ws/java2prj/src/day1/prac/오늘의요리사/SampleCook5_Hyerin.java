package day1.prac.오늘의요리사;

public class SampleCook5_Hyerin extends Cook implements 중식가능한{
	
	public SampleCook5_Hyerin(String name) {
		super(name);
	}

	@Override
	public String 탕수육만들기() {
		return "탕수육";
	}

}
