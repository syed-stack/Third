package fourth;

public class PublicclassSwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15, y=20;
		System.out.println("numbers before swap");
		System.out.println("value of x =" + x);
		System.out.println("value of y ="+y);
		x = x-y;
		y = x+y;
		x = y-x;
		System.out.println("numbers after swap");
		System.out.println("value of x ="+x);
		System.out.println("value of y ="+y);

	}

}
