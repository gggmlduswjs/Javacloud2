package day2.prac.람다.오전실습.김민희;


/* Interface : 클래스들이 따라야하는 규칙을 정의한 설계도   //메서드 이름,형태만 정의. 내용X
 * => implements 상속해 클래스 내용을 채움
 * 다른 클래스들이 같은규칙(메서드)로 동작
 * 
 * **Functional Interface**  //메서드가 하나만 있는 인터페이스
 *  @FunctionalInterface
 *  interface 인터페이스 이름 {
 *  	메서드 1개
 *  }
 *  => 1.일반 클래스 구현
 *  => 2.익명 클래스 구현
 *  => 3.람다 구현
 */

@FunctionalInterface
public interface MyInterface {
	public void my();
}
