import java.util.Scanner; //�Է� ����� ���� Ŭ���� ���Խ�Ű�� ���� 
public class GetInput {
	public static void main(String args[])
	{
		/*
		 * Scanner input=new Scanner(System.in);
		 *  int a;
		 *  double b;
		 *   int sum;
		 * 
		 * System.out.println("ù��° ���ڸ� �Է��Ͻÿ�:"); 
		 * a=input.nextInt();//���� ���� ��
		 * 
		 * System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�:"); 
		 * //println:��µ� ���ڿ��� ���� �ٿ� �Է¹��� 
		 * //print:��µ� ���ڿ��� ���� �ٿ� �Է¹���. 
		 * b=input.nextDouble();//�Ǽ� ���� ��
		 * 
		 * sum=a+b; System.out.println("�μ��� ���� "+sum+"�Դϴ�.");
		 */
		Scanner input=new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸��� �Է��Ͻÿ�:");
		name=input.nextLine();//�� ���� ���� ��
		System.out.print("���̸� �Է��Ͻÿ�:");
		age=input.nextInt();
		
		System.out.println(name+"�� �ȳ��ϼ���!"+(age)+"���̽ó׿�.");
	}
}
 