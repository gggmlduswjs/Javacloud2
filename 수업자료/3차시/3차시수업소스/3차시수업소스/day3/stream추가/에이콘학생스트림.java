package day3.stream추가;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



//에이콘 학생정보   ->  국어점수만   int형 스트림으로 만든다음 합계구하기
// 통계정보 얻기
// 변환하기  ,  List<String>  , List<Set>  , Map<String, Acorn>


public class 에이콘학생스트림 {
    public static void main(String[] args) {
        // ArrayList에 Acorn 객체 여러 개 추가
        List<Acorn> list = new ArrayList<>();
        list.add(new Acorn("권지언", 90, 80, 70));
        list.add(new Acorn("김민환", 85, 95, 75));
        list.add(new Acorn("최하은", 88, 92, 86));
        list.add(new Acorn("황예지", 70, 65, 80));
        list.add(new Acorn("김보성", 60, 77, 83));
        list.add(new Acorn("최지태", 95, 90, 93));
        list.add(new Acorn("이동우", 78, 84, 89));
        
        // 람다식으로 국어 점수만 IntStream으로 만들기 (기본형스트림으로 변환됨)
        IntStream korStream = list.stream()
                                  .mapToInt(acorn -> acorn.getKor());
        
        // 출력
        korStream.forEach(kor -> System.out.println(kor));
        
        
        
        
        // 기본형스트림이 제공하는 기능들을 사용할 수 있다.
        // 요약통계정보 얻기
        
        IntSummaryStatistics st=  list.stream().mapToInt( acorn -> acorn.getKor()).summaryStatistics();        
        System.out.println( st);
        //변환하기
        //List<Acorn>  strList1 =list.stream().collect(Collectors.toList());
  
       
        
        //변환하기
        List<String>  strList =list.stream().map( acorn -> acorn.getName()).collect(Collectors.toList());
        Set<Integer>  set =list.stream().map( acorn -> acorn.getKor()).collect(Collectors.toSet());
        Set<Acorn>  acornSet =list.stream().map( acorn -> acorn ).collect(Collectors.toSet());
        Map<String, Acorn> map = list.stream()
                .collect(Collectors.toMap(
                    acorn -> acorn.getName(), // Key: 이름
                    acorn -> acorn            // Value: 객체 그 자체
                ));
        
        
        
     // Acorn acorn= map.get("이동우");
        Acorn acorn= map.get("최하은");
      System.out.println( acorn);
       
        
        
        
       
        
        
    }
}
