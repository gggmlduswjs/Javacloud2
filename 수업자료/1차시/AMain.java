package day1prac.제네릭매서드;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
		  int result  =A.getIndex(strings, "apple");		  
		  System.out.println( result);
		  
		  
		 int result2=  A.<String>getIndexG(strings, "apple");
		 System.out.println( result2);
		 
		 
		 Integer[] ints= {10,9,50,4,32};		 
		 int result3= A.<Integer>getIndexG(ints, 9);
		 System.out.println( result3);
		 
		  

	}

}
