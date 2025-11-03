package day1.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class 객체정렬Comparator객체구현하기 {

	public static void main(String[] args) {
		 

		ArrayList<Student2> list  = new ArrayList<>();
		
		
		
		list.add( new Student2("이성빈", 3, 300));
		list.add( new Student2("최성원", 1, 200));
		list.add( new Student2("정지원", 2, 100));
		list.add( new Student2("박성욱", 2, 150));
		list.add( new Student2("유승재", 1, 200));
		list.add( new Student2("김서호", 3, 290));
		list.add( new Student2("김민희", 3, 180));		
		
		Collections.sort( list,  new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return  o1.getBan()  - o2.getBan();
	     }});

		 
		
		System.out.println(  list);
		
		
		
	

	}

}



//


 