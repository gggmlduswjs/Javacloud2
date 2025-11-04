package day2.prac.람다.function;

import java.util.ArrayList;

public class 약수구하기 {

	
	public static void main(String[] args) {
		
		
		int su=10;
		
		
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(int i=1;i<su; i++) {
			if(su % i ==0) {
				//i가 약수다
				list.add(i);
			}
		}
		
		
		//약수출력하기
		for(Integer num : list) {
			
			System.out.println(num);
			
		}
	}
}
