package day2.prac.람다.오전실습.박성욱;

import day2.prac.람다.함수형인터페이스.AddInterface;

public class 복습_람다식_제출 {
public static void main(String[] args) {
	AddInterface a = (price,people)->  price / people;;
	int result = a.add(100000, 4);
	
	System.out.println("인당"+result+"원");
	
}
}
