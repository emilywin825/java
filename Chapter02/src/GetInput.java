import java.util.Scanner; //입력 기능을 가진 클래스 포함시키는 문장 
public class GetInput {
	public static void main(String args[])
	{
		/*
		 * Scanner input=new Scanner(System.in);
		 *  int a;
		 *  double b;
		 *   int sum;
		 * 
		 * System.out.println("첫번째 숫자를 입력하시오:"); 
		 * a=input.nextInt();//정수 읽을 때
		 * 
		 * System.out.print("두번째 숫자를 입력하시오:"); 
		 * //println:출력된 문자열의 다음 줄에 입력받음 
		 * //print:출력된 문자열과 같은 줄에 입력받음. 
		 * b=input.nextDouble();//실수 읽을 때
		 * 
		 * sum=a+b; System.out.println("두수의 합은 "+sum+"입니다.");
		 */
		Scanner input=new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름을 입력하시오:");
		name=input.nextLine();//한 줄을 읽을 때
		System.out.print("나이를 입력하시오:");
		age=input.nextInt();
		
		System.out.println(name+"님 안녕하세요!"+(age)+"살이시네요.");
	}
}
 