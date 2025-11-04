package day1.prac.오늘의요리사;

public class SampleMHCook  extends Cook implements 일식가능한 {

	
	public SampleMHCook(String name) {
		super(name);								
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "대박맛집우동";
	}

}

