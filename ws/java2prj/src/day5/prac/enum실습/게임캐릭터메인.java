package day5.prac.enum실습;

import java.util.Arrays;

import day5.enumEx3.CharacterState;

public class 게임캐릭터메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		게임캐릭터 영웅 = new 게임캐릭터("영웅");
		게임캐릭터 전사 = new 게임캐릭터("전사");
		게임캐릭터 마법사 = new 게임캐릭터("마법사");
		게임캐릭터 암살자 = new 게임캐릭터("암살자");
		
		영웅.printStatus();
		전사.printStatus();
		마법사.printStatus();
		암살자.printStatus();
		
		
		영웅.attack();
		전사.defend();
		마법사.die();
		암살자.attack();
		
		
		영웅.printStatus();
		전사.printStatus();
		마법사.printStatus();
		암살자.printStatus();
		
		// enum에 정의된 값 확인하기
		System.out.println(  CharacterState.values());
		
		System.out.println(  Arrays.toString(CharacterState.values()));
		

	}

}
