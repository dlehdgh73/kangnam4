package ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printIn() => print and new Line
		//print()=> ���� �ٿ��� ��� �̾ ���
System.out.println("�̸�,����, ����,ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
Scanner scanner = new Scanner(System.in);

String name =scanner.next();
System.out.println("�̸��� " +name+",");

String city=scanner.next();
System.out.println("���ô� " +city+",");

int age=scanner.nextInt();
System.out.println("���̴� "+age+"��,");

double weight=scanner.nextDouble();
System.out.println("ü���� " + weight+"kg,");

boolean single=scanner.nextBoolean();
System.out.println("���ſ��δ� "+single+"�Դϴ�.");

//�ڿ�����
scanner.close();




	}

}
