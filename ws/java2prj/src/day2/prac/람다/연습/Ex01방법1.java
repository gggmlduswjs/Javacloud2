package day2.prac.람다.연습;


class RunnableBucket implements Runnable {

	@Override
	public String add(String BucketList) {
		// TODO Auto-generated method stub
		return BucketList;
	}
	
}

public class Ex01방법1 {

	public static void main(String[] args) {
		
		RunnableBucket Bucket = new RunnableBucket();
		String result = Bucket.add("취업하기");
		
		System.out.println(result);

	}

}
