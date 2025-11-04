package day2.prac.람다.연습;

public class Ex03방법3 {

	public static void main(String[] args) {
		
		Runnable Bucket3 =(BucketList) ->BucketList;
		String result3=Bucket3.add("자취하기");
		
		System.out.println(result3);

	}

}
