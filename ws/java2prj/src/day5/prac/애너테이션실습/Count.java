package day5.prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 사용자 애너테이션 만들기
// 유지범위 : runtime => 실행시(runtime)까지 애너테이션 정보가 유지됨

@Retention(RetentionPolicy.RUNTIME)
public @interface Count {

	int value() default 1;	// 어노테이션객체.value()로 애너테이션에 설정값을 가져올 수 있다 value라는 이름은 생략할 수 있다.
	
}
