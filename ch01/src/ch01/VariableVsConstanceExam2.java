package ch01;

public class VariableVsConstanceExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//변수의 선언과 동시에 값 초기화
	//타입 변수명=값;	
		int x=10;
int y;
	
	// 변수의 선언
		//타입 변수명;
		int y;
		//선언된 변수의 값 초기화
		//변수명=값;
		y=20;
	//변수 x에 저장된 초기값을 정수 20으로 변경하여 저장
		x=20;
		
		System.out.println(x+y);
		
		//상수 선언
		//final 타입 변수명=값;
		//상수는 일반적으로 대문자로 표시함.(변수와 구분)
		double PI=3.141591;
		//반지름 r=5인 원의 넓이
		//PI*r*r
		//실수타입 변수를 선언하고 실수 변수PI의 값과 정수5를 제곱한 결과값을 저장
		double area = PI*5*5;//3.141591*5.0*5.0
				
		//출력
		System.out.println(area);//실수값으로 출력
		
		
	//상수로 선언된 변수의 값은 초기화 후 변경시 오류발생함.
	
	
	}

}
