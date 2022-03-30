import java.util.*;

public class CircleArea {
	public static void main(String args[]){
		
	double r;
	double area;

	Scanner input=new Scanner(System.in);
	System.out.print("반지름을 입력하시오:");
	r=input.nextDouble();
	area=r*r*3.14;
	
	System.out.println(area);
	
	input.close();
	}
}
