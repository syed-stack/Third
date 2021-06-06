package fourteenth;
import java.util.Scanner;

public class ClassCircleDemo {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the radius :");
		double radius = sc.nextDouble();
		double area =Math.PI * (radius *radius);
		System.out.println("the area of circle is :" + area);
		double circumference = Math.PI * 2 * radius;
		System.out.println(" circumference of circle is : " + circumference);


	}

}
