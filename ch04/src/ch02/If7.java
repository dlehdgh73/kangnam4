package ch02;

import java.util.Scanner;

public class If7 {

	
		public class GradingEx {

			
		public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100):");
		int score=scanner.nextInt();//���� �б�
String grade="A";
//���� >=90, ����<95=>A-, 95==A0, ����>95<=100=>A+
if(score>=90) {//90~100, 90~95, 95, 95~100
	grade="A"; // 90�̻�
	if(score>95) grade +="+";//"A"+"+" = "A+" // 96~100  ->����!!!
	else if(score==95) grade+="0"; // score==95; "A"+"0" = "A0" // 95 ->����!!!
	else grade +="-"; // 
}
		else if(score=95) grade='A0';//90�̸� �߿��� 80�̻�
		else if(score<95) grade='A-';//80�̸� �߿��� 70�̻�
		else if(score>=90) grade='A';//70�̸� �߿��� 60�̻�
		

		System.out.println("������ " + score + "�Դϴ�.","������ " + grade + "�Դϴ�.");
	}

}
