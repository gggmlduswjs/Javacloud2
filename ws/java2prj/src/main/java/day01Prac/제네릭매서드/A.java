package day01Prac.제네릭매서드;

public class A {
	
	public static int getIndex (String[] list, String target) {
		int index=-1;
		for(int i=0; i<list.length; i++) {
			String item = list[i];
			if(item.equals(target)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//제네릭 매서드 
    public static  <T> int getIndexG ( T[]  list, T target) {	
    	 int index=-1;
           for( int i=0; i < list.length; i++){ 
                T item  = list[i];
                if( item.equals( target) ){
                        index = i;        
                        break;                   
                 }
           }
         return index;
    }

}
