package day2.prac.람다.오전실습.전희연;

public class Ex02방법2 {
	
	public static void main(String[] args) {
		
		Runnable Bucket2 = new Runnable() {

			@Override
			public String add(String BucketList) {
				// TODO Auto-generated method stub
				return BucketList;
			}
			
		
		
		};
		
		String result2 = Bucket2.add("여행가기");
		
		System.out.println(result2);
		
	}
	
	
	
	

}
