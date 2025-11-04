package day2.prac.람다.오전실습.이동규;

import java.util.Scanner;

public class My2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단을 입력하세요: ");
        int dan = sc.nextInt();

        Myinter m = new Myinter() {
            @Override
            public void run(int num) {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
				}
			}};
			
		m.run(dan);
		
		}
}
