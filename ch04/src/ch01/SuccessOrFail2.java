package ch01;

import java.util.Scanner;

public class SuccessOrFail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("������ �Է��ϼ���-������:");


int score=scanner.nextInt();
//������ ���̸� ��{}����

//if (score>=80) {
	//System.out.println("�����մϴ�. �հ��Դϴ�.");
	
	}else {// score<80
	System.out.println("�ƽ�����. ���հ��Դϴ�.");
	}
*/ 
if (score>=80) {
	//System.out.println("�����մϴ�. �հ��Դϴ�.");
	
	else// score<80
	System.out.println("�ƽ�����. ���հ��Դϴ�.");
	
	//���׿��������
	System.out.println((score>=80)? "�����մϴ�. �����Դϴ�." :");
	
	
	
	
	//�ڿ�����
scanner.close();
	}

}
