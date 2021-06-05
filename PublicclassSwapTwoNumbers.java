package third;

public class PublicclassSwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15, y = 20;
		System.out.println("numbers before swap ");
		System.out.println("value of x = " + x);
		System.out.println("value of y = " + y);
		int temporary = x;
		x=y;
		y=temporary;
		System.out.println("numbers after swap");
		System.out.println("value of x =" +x);
		System.out.println("value of y =" + y);

	}

}
