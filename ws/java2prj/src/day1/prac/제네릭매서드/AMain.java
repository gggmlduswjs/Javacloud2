package day1.prac.제네릭매서드;

public class AMain{

    public static void main( String[] args){
       String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};   
       int result= A.getIndex( strings, "apple");
       System.out.println(result);
       
       int result2 = A.<String>getIndexG(strings,"banana");
       System.out.println(result2);
       
       
       Integer[] ints = {10,9,50,4,32};
       
       
       
       int result3 = A.getIndexG(ints, 50);
       
       System.out.println(result3);
    }
    
    //Acorn[], Acorn
}
