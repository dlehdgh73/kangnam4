package ch01;

public class VariableVsConstanceExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//������ ����� ���ÿ� �� �ʱ�ȭ
	//Ÿ�� ������=��;	
		int x=10;
int y;
	
	// ������ ����
		//Ÿ�� ������;
		int y;
		//����� ������ �� �ʱ�ȭ
		//������=��;
		y=20;
	//���� x�� ����� �ʱⰪ�� ���� 20���� �����Ͽ� ����
		x=20;
		
		System.out.println(x+y);
		
		//��� ����
		//final Ÿ�� ������=��;
		//����� �Ϲ������� �빮�ڷ� ǥ����.(������ ����)
		double PI=3.141591;
		//������ r=5�� ���� ����
		//PI*r*r
		//�Ǽ�Ÿ�� ������ �����ϰ� �Ǽ� ����PI�� ���� ����5�� ������ ������� ����
		double area = PI*5*5;//3.141591*5.0*5.0
				
		//���
		System.out.println(area);//�Ǽ������� ���
		
		
	//����� ����� ������ ���� �ʱ�ȭ �� ����� �����߻���.
	
	
	}

}
