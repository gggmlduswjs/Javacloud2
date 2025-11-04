package day2.prac.람다.오전실습.김현희;

interface AInterface{
	//하나큰수출력
	int a(int su1);
	
}

class AInterfaceImp implements AInterface{

	@Override
	public int a(int su1) {
		
		return su1 + 1;
	}
	
}
