package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparable구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student> list  = new ArrayList<>();
		
		list.add( new Student("이성빈", 3, 300));
		list.add( new Student("최성원", 1, 200));
		list.add( new Student("정지원", 2, 100));
		list.add( new Student("박성욱", 2, 150));
		list.add( new Student("유승재", 1, 200));
		list.add( new Student("김서호", 3, 290));
		list.add( new Student("김민희", 3, 180));
	 
	 
		
		
		// 객체는  Comparable을 구현해야 한다 
		 
		
		Collections.sort( list ); 		
		System.out.println(  list);
		
		
		
	

	}

}



//


 