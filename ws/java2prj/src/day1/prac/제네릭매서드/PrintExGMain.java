package day1.prac.제네릭매서드;

public class PrintExGMain {
	
	public static void main(String[] args) {
		PrintExG.<String>print("제네릭 매서드 연습하기 ^^");
		PrintExG.<Integer>print(5);
		PrintExG.<Dog>print(new Dog("뽀삐",2));
		
		PrintExG.print("제네릭 매서드 연습하기 ^^ !!");
		PrintExG.print(5);
		PrintExG.print(new Dog("뽀삐 !!",2));
	}

}
