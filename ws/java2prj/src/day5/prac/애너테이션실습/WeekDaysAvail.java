package day5.prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention( RetentionPolicy.RUNTIME)
public @interface WeekDaysAvail {
	String[] value();
	
}