package ch02;

public class AssignmentIncDecOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int타입 변수 선언시 int타입이고 변수명이 다른 경우 ,로 나열해서 선언 가능 
		int a=3, b=3, c=3;//int a=3; int b=3; int c=3
		
		//대입 연산자 사례
		a+=3;// a=a+3 = 6;
		b*=3;// b=b*3 = 9;
		c%=2;// c=c%2 = 1;
		
		//자바 언어로 개발시 여러개의 매개변수(인수, arguments)로 만드지 않아서 그렇습니다.
		//System.out.println(a,b,c);
		
		System.out.println("a=" + a +" , b="+b+", c="+c);//);// 출력 결과 "a=6, b=9,c=1"
		// 결합연산 +
		// "a=" +6 => "a="+"6" => "a=6", "a=6" + ", c=" => "a=6, b=" + b=> "a=6, b="+"9" => "a=6,b=9"+",c="=> "a=6,b=9,c="+c
		//"a=6,b=9,c=" + "1" => "a=6,b=9,c=1"
		
		ind d=3; 
		//증감 연산자 사례
		a= d++;//a=3, d=4
		System.out.println("a="+a+",d="+d);
		a=++d; //a=5,d=5
		
		
	}

}
