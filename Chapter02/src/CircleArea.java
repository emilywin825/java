import java.util.*;

public class CircleArea {
	public static void main(String args[]){
		
	double r;
	double area;

	Scanner input=new Scanner(System.in);
	System.out.print("�������� �Է��Ͻÿ�:");
	r=input.nextDouble();
	area=r*r*3.14;
	
	System.out.println(area);
	
	input.close();
	}
}
