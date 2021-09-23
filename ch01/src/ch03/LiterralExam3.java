package ch03;

/*리터럴은 타입을 가진다. - 표시되는 형식에 따라 컴퓨터(jvm)타입을 인식함*/
public class LiterralExam3 {

	public static void main(String[] args) {
		double d1=12.;
		double d2=12.0;
		double d3=0.1234;
		double d4=1234e-4; //e는 10을 의미
		double d5=1234E-4;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);

		//실수리터럴 f는 32비트 범위, d는 2배정도 64비트 범위
		float f = 0.1234f;
		double w = .1234d;
	
		//대입연산자 =을 기준으로
				//왼쪽은 32비트를 저장할수 있는 범위의 공간
				//오른쪽은 64비트 길이를 가진 리터럴
				//저장불가
		float f2 = .1234d; //
		double w2 = 0.1234f;
		
		//실수타입의 리터럴은 숫자값 뒤에 f나,d 표시를 하지않으면
		//default로 d(double)로 인식함.
		
		
		
		float f3= .1234;//
		
	    
	
	}

}
