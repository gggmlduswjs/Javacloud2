package day2prac.람다.foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();

		// 하나씩 등록
		drinks.add("콜라");
		drinks.add("사이다");
		drinks.add("환타");
		drinks.add("레몬에이드");
		drinks.add("오렌지주스");
		drinks.add("아이스티");
		drinks.add("밀크티");
		drinks.add("커피");
		drinks.add("에너지드링크");
		drinks.add("생수");
		
		
		//소비하다
		/* interface Consumer {
		              //약속 구현할 매서드 
		          void  accept( Object o);
		  
		   }
		
		   1.이름있는 클래스 
		   2. 익명
		   2.람다식
		   
		   
		   
		    interface Consumer<T> {
		              //약속 구현할 매서드 
		          void  accept( T o);
		  
		   }
		 */
		drinks.forEach( (item) -> System.out.println( item)  );
		
		
		drinks.forEach(  new Consumer<String>() {

			@Override
			public void accept(String t) {
				  System.out.println( t +"^^");
				
			}});
		
		
	
	   class A  implements Consumer<String> {

		@Override
		public void accept(String t) {
		      System.out.println(t + "!!");
			
		}		   
	   }
	   
	   
	   drinks.forEach( new A());

	}

}
