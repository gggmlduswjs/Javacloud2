package day2.lambda.매개변수전달;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
 

public class 매개변수로전달된_람다식4 {

	public static void main(String[] args) {
		 
		
		ArrayList<Acorn> list  = new ArrayList<>();
		
		list.add( new Acorn( "acorn1", "0000", "이동규"));
		list.add( new Acorn( "acorn2", "1234", "최정문"));
		list.add( new Acorn( "acorn3", "3456", "윤태민"));
		list.add( new Acorn( "acorn4", "1234", "이혜린"));
		list.add( new Acorn( "acorn5", "5678", "우동훈"));
		list.add( new Acorn( "acorn6", "1090", "손민영"));
		list.add( new Acorn( "acorn7", "0000", "김민희"));
		list.add( new Acorn( "acorn8", "0000", "김서호"));
		list.add( new Acorn( "acorn9", "1234", "유승재"));
	 
		
		
		Collections.sort( list, new Comparator<Acorn>() {

			@Override
			public int compare(Acorn o1, Acorn o2) {				 
				return o1.getName().compareTo( o2.getName());
			}
			
		});
		
		
		
		//람다식
		Collections.sort( list, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		
		 
	}

}
