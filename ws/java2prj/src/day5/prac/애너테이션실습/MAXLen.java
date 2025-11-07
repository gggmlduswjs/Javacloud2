package day5.prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// 기본이 class 유지범위 -> 실행 시 유지범위 꼭 바꿔주세요
@Retention(RetentionPolicy.RUNTIME)
public @interface MAXLen {
	
	int length();
	
}
