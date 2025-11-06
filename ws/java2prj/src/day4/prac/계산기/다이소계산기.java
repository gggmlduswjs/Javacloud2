package day4.prac.계산기;

public class 다이소계산기 implements Calculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("다이소");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("다이소");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("다이소");
		return su1*su2;
	}

}
