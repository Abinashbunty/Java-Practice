import java.util.*;
class q7
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int ch = 1;

		int a, b;

		while(ch!=0)
		{
			System.out.println("Enter 2 numbers to add.");

			a = obj.nextInt();
			b = obj.nextInt();

			System.out.println("Sum of "+a+" and "+b+" = "+ (a+b));

			System.out.println();
			System.out.println("Enter 0 to exit");
			ch = obj.nextInt();
		}
	}
}