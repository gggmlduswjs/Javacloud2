package day01Prac.오늘의요리사;

public class SampleCook5_우동훈 extends Cook implements 한식가능한 {

	public SampleCook5_우동훈(String name) {
		super(name);
	}

	@Override
	public String 비빔밥만들기() {
		return "돌솥비빔밥";
	}
	
	
}
