package day1.prac.정렬;

// 라이브러리
// 정렬

interface MyComparable{
	int compareTo(Object other);	// 양수가 오면 기준이 큰 것
}

public class MyArrays { 
	
	public static void sort(Object[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {	//기준
			//
			
			for(int j=i+1; j<arr.length; j++) {	// 비교대상
				// 결정할 수 없는 코드가 발생되면 인터페이스를 만들고 사용한다
				
				MyComparable obj = (MyComparable) arr[i];
				if( obj.compareTo(arr[j])>0) {
					Object tmp;
					tmp =arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		}
		
	}

}
