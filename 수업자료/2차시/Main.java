package day2prac.람다.실습;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable bucketList = () -> {
			System.out.println("버킷1");
			System.out.println("버킷2");
			System.out.println("버킷3");
		};
		
		bucketList.run();
		System.out.println("\n====================================\n");
		
		Consumer<Integer> shopping = (money) -> {
			System.out.println("달걀 구매");
			money -= 3000;
			
			System.out.println("당근 구매");
			money -= 4000;
			
			System.out.println("대파 구매");
			money -= 5000;
			
			System.out.println("햄 구매");
			money -= 6000;
			
			System.out.println("잔액 : " + money);
		};
		shopping.accept(50000);
		System.out.println("\n====================================\n");
		
		
		Supplier<Cook> s_cook = () -> {
			Cook 계란말이 = new Cook();
			계란말이.setName("계란말이");
			계란말이.setIngredients(new String[] {"달걀", "당근", "대파", "햄"});
			
			String recipe = "1. 재료 손질\n"
				  + " - 당근과 대파(또는 양파, 햄 등)를 잘게 다진다.\n"
				  + " - 볼에 달걀 4개를 넣고 소금 한 꼬집을 넣은 뒤 잘 풀어준다.\n"
				  + " - 다진 재료를 모두 넣고 고루 섞는다.\n\n"
				  + "2. 팬 예열\n"
				  + " - 중약불로 팬을 달군 뒤 식용유를 살짝 두른다.\n"
				  + " - 키친타월로 기름을 얇게 펴준다.\n\n"
				  + "3. 계란 굽기\n"
				  + " - 달걀물을 팬에 얇게 붓는다.\n"
				  + " - 아랫면이 살짝 익으면 가장자리부터 돌돌 말기 시작한다.\n"
				  + " - 절반쯤 말았으면 한쪽으로 밀고, 남은 달걀물을 다시 부어 겹쳐가며 말아준다.\n"
				  + " - 이 과정을 2~3회 반복한다.\n\n"
				  + "4. 마무리\n"
				  + " - 약불로 전체를 한 번 더 익혀준다.\n"
				  + " - 완전히 익으면 꺼내어 잠시 식힌 뒤 한입 크기로 썬다.\n\n"
				  + "💡 팁:\n"
				  + " - 계란물을 체에 한 번 거르면 부드럽고 매끈한 식감이 난다.\n"
				  + " - 불이 세면 타기 쉬우므로 중약불에서 천천히 말아준다.\n"
				  + " - 치즈 계란말이를 만들 때는 마지막 말기 전에 슬라이스 치즈를 넣는다.";

			계란말이.setRecipe(recipe);
			
			System.out.println(계란말이.getRecipe());
			
			return 계란말이;
		};
		Cook cook1 = s_cook.get();
		System.out.println("\n====================================\n");
		
		
		Predicate<Cook> p_cook = (c) -> {
			if(c.getName().equals("계란말이")) return true;
			else return false;
		};
		boolean isMine = p_cook.test(cook1);
		if(isMine) System.out.println("내 요리 맞다");
		else System.out.println("내 요리 아니다");
		System.out.println("\n====================================\n");
		
//        - 입력으로 들어오는 수의 제곱  반환하기
		Function<Integer, Integer> square = (num) -> num * num;
		System.out.println(square.apply(11));
		System.out.println("\n====================================\n");
		
//        - 입력으로 들어오는 수의 범위안의 난수 반환하기
		Function<Integer, Integer> rNum = (num) -> {
			Random rand = new Random();
			return rand.nextInt(num);
		};
		System.out.println(rNum.apply(10));
		System.out.println("\n====================================\n");
		
//        - 입력으로 들어오는 금액에 대한 화폐매수 구하기
		Function<Integer, String> money = (m) -> {
			int[] units = {50000, 10000, 5000, 1000, 500, 100};
	        int[] counts = new int[units.length];

	        int remaining = m;

	        for (int i = 0; i < units.length; i++) {
	            counts[i] = remaining / units[i];
	            remaining %= units[i];
	        }
			
			return "5만원 : " + counts[0] + "\n"
				+ "1만원 : " + counts[1] + "\n"
				+ "5천원 : " + counts[2] + "\n"
				+ "1천원 : " + counts[3] + "\n"
				+ "5백원 : " + counts[4] + "\n"
				+ "1백원 : " + counts[5]; 
		};
		System.out.println(money.apply(126700));
		
		
	}

}
