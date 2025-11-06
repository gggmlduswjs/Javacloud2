package day4.prac.복습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Movie  implements Comparable<Movie> {
    private String title;
    private String director;
    private int year;

    // 생성자
    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    // toString 메서드 (영화 정보를 출력하기 쉽게)
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return  this.year  - o.year;    // 
	}
}

//스트림: 데이터흐름 
//선언식방법으로 데이터를 편리하게 처리하게 해줌 
//filter(필터링), map(변환) , collect(수집)

public class Ex02 {

	public static void main(String[] args) {
		
		// 컬렉션 - 자료를 담는 그릇
		// List, Set, Map(데이터 집합을 저장하는 방식)
	    ArrayList<Movie> movies = new ArrayList<>();

        // Movie 객체 10개 추가
        movies.add(new Movie("기생충", "봉준호", 2019));
        movies.add(new Movie("올드보이", "박찬욱", 2003));
        movies.add(new Movie("신과 함께: 죄와 벌", "김용화", 2017));
        movies.add(new Movie("범죄도시", "강윤성", 2017));
        movies.add(new Movie("관상", "한재림", 2013));
        movies.add(new Movie("암살", "최동훈", 2015));
        movies.add(new Movie("부산행", "연상호", 2016));
        movies.add(new Movie("살인의 추억", "봉준호", 2003));
        movies.add(new Movie("명량", "김한민", 2014));
        movies.add(new Movie("해운대", "윤제균", 2009));
        
        
        //스트림 - 데이터를 흐름으로 다루는 방법
        // 데이터를 반복문으로 꺼내지 않고 필터링, 정렬, 집계 등을 함수형 스타일로 처리하는 기술 
      
        //1. 영화 목록 출력하기 
        // 이터레이터
        Iterator<Movie> it = movies.iterator();
        while(it.hasNext()) {
        	Movie item=it.next();
        	 System.out.println( "******");
        	 System.out.println(item.getTitle());
        	 System.out.println(item.getYear());
        	 System.out.println( "******");
        }
        
        
        // Stream+forEach : 컬렉션 안의 데이터를 내부적으로 자동 반복시키는 방식
        // .stream() -> 내부적으로 Iterator를 얻음
        // .forEach() -> 내부에서 알아서 .hasNext(), next() 호출
        // 개발자는 무엇을 할지 람다식으로 적으면 됨 
        // 람다식 (매개변수) -> {실행할 코드}
         movies.stream().forEach( ( item )->{
        	 System.out.println( "******");
        	 System.out.println(item.getTitle());
        	 System.out.println(item.getYear());
        	 System.out.println( "******");
         });
        
        // 스트림
        // 중간 연산 : filter, map, sorted, distinct, limit => 데이터를 가공하거나 걸러냄
        // 최종 연산 : forEach, count, collect, sum, max, min => 결과를 실제로 내보냄
        
        //2.2015년 이후 영화 정보 조회    // (item  )->{ return  item.getYear()>2015 ;}
         movies.stream()
         .filter( item -> item.getYear() >=2015)
         .forEach(item-> System.out.println( item));
        
        
        //3. 영화이름만  List 만들기 
         
       List<String> titleList  =  movies.stream()
    		   .map( ( item )->{ return item.getTitle();})
    		   .collect(Collectors.toList());
        
        
       System.out.print( titleList);
        
        //4. 영화이름과 감독을   HashMap(  키:영화이름, 값:감독 )변환
       Map<String, String> map = new HashMap<>();
       for(Movie m: movies) {
    	   map.put(m.getTitle(), m.getDirector());
       }
       
       
       Map<String, String> moviemap= movies.stream()
    		   .collect( Collectors.toMap( item -> item.getTitle(), item -> item.getDirector()));
        
        
       
       System.out.println(moviemap);
       
       
        
        //5.정렬  (기본정렬-객체내부에 있는  Comparable)
        System.out.println("=== 년도순 정렬");
        movies.stream()
        .sorted().forEach(item  -> System.out.println( item));
        
        
        //6.정렬(  Comparator )
        System.out.println("=== 타이틀 정렬");
        movies.stream()
        .sorted( ( o1, o2)->{ return o1.getTitle().compareTo(o2.getTitle()); })
        .forEach( item -> System.out.println( item));

	}

}
