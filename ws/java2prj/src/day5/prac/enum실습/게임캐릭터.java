package day5.prac.enum실습;

public class 게임캐릭터 {
	
	String name;
	CharactorState state;
	
	// 생성자
	public 게임캐릭터() {
		// TODO Auto-generated constructor stub
	}
	
	public 게임캐릭터(String name) {
		super();
		this.name = name;
		this.state = CharactorState.정상;
	}
	
	
	// 매서드
	
	// 공격하기
	public void attack() {
		state=CharactorState.공격;
		System.out.println(name+"공격 상태로 전환되었습니다");
	}
	
	// 수비하기
	public void defend() {
		state=CharactorState.수비;
		System.out.println(name+"수비 상태로 전환되었습니다");
	}
	
	// 죽기
	public void die() {
		state=CharactorState.죽음;
		System.out.println(name+"죽음 상태로 전환되었습니다");
	}
	
	//
	
	
	public void printStatus() {
		System.out.println(state);
	}
	
	@Override
	public String toString() {
		return "게임캐릭터 [name=" + name + ", state=" + state + "]";
	}
	

}
