package ch02;

import java.util.Scanner;

public class If7 {

	
		public class GradingEx {

			
		public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100):");
		int score=scanner.nextInt();//점수 읽기
String grade="A";
//점수 >=90, 점수<95=>A-, 95==A0, 점수>95<=100=>A+
if(score>=90) {//90~100, 90~95, 95, 95~100
	grade="A"; // 90이상
	if(score>95) grade +="+";//"A"+"+" = "A+" // 96~100  ->질문!!!
	else if(score==95) grade+="0"; // score==95; "A"+"0" = "A0" // 95 ->질문!!!
	else grade +="-"; // 
}
		else if(score=95) grade='A0';//90미만 중에서 80이상
		else if(score<95) grade='A-';//80미만 중에서 70이상
		else if(score>=90) grade='A';//70미만 중에서 60이상
		

		System.out.println("점수는 " + score + "입니다.","학점은 " + grade + "입니다.");
	}

}
