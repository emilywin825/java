//2차방정식 근 구하기
public class QuadraticEquatiaon {
	public static void main(String[] agrs){
		
		double b,c;
		  b= -3.0;
		  c= 2.0;
		  
		double answer1,answer2;
		answer1=(-b+Math.sqrt(b*b-4*c))/2;
		answer2=(-b-Math.sqrt(b*b-4*c))/2;

		System.out.println(answer1);
		System.out.println(answer2);

	}
}
