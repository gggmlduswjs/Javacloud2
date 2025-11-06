package day3.stream.맛보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 
 

public class Book리스트스트림사용하기 {

	public static void main(String[] args) {
		
		ArrayList<Book> set  = new ArrayList<>();
		set.add( new Book("이것이자바다", 25000) );
		set.add( new Book("자바의 정석", 23000) );
		set.add( new Book("신나는 자바책", 26000) );
		set.add( new Book("자바길라잡이", 25000) );
		set.add( new Book("자바책", 21000) );
		
		
		 Stream<Book> stream = set.stream();
	  
		
		 // stream.sorted( (o1,o2) -> o1.getPrice() -o2.getPrice()).forEach( t -> System.out.println(t));
		 
		 
		
	    //  List<Book>d =stream.sorted( Comparator.<Book, Integer>comparing(  item -> item.getPrice() )).collect( Collectors.toList()); 
		//  List<Book>d =stream.sorted( Comparator.<Book, Integer>comparing(  item -> item.getPrice() )).toList(); 
		
		//  System.out.println(d);
		  
		 
		 //책정보에서 책이름만 리스트로 만들기
		 
		// List<String>  titleList  =   stream.map( item  -> item.getTitle()).collect(Collectors.toList());
		// System.out.println( titleList);
		  
		 
		 //책정보에서 책가격만 리스트로 만들기		 
		List<Integer> priceList  = stream.map( item  -> item.getPrice()).collect( Collectors.toList());
		System.out.println( priceList);
		 
	}

}
