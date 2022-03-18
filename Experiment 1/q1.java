import java.util.*;
class q1
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the radius of the circle");
		int r = obj.nextInt();

		double area = 3.14 * r * r;

		System.out.println("Area = " + area);
	}
}