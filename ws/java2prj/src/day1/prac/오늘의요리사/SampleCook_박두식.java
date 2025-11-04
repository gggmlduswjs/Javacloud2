package day1.prac.오늘의요리사;

public class SampleCook_박두식 extends Cook implements 일식가능한{
		SampleCook_박두식(String name) {
			super(name);
		}
	
		@Override
		public String 초밥만들기() {
			return "장어초밥";
		}
}
