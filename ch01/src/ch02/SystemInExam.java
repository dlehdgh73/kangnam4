package ch02;

public class SystemInExam {

	//ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ����. - ���� ó��
	
	public static void main(String[] args) throws Exception{//����ó�� ���� Throws Exception �߰�
		// TODO Auto-generated method stub
		//���� p.126~128 ����
//ǥ�� �Է½�Ʈ������ �� �Է� �ޱ�
		System.out.println("�Է�:");
		int a= System.in.read(); //'A' -> ASCII 65�� �ν�
		System.out.println("���:"+a); // keyboard�� Ű�� �Է� �� EnterŰ�� ����(EnterŰ='\r''\n')
		System.in.read();//
		System.in.read();//
		
		
		//system.in.read()-48 or'0'; ==����
		System.out.println("�Է�:");
		int num= System.in.read() -48;// ASCII - 48 48-48=0
		//int num=System.in.read() -'0';
		System.out.println("��� : " +num);
		System.in.read();
		System.in.read();
		
		
		//(char)system.in.read(); ==����
				System.out.println("�Է�:");
				char char_ = (char)System.in.read(); // 'A' - > 65(int) -> char 'A'
				//int num=System.in.read() -'0';
				System.out.println("��� : " + char_);
			
	}

}
