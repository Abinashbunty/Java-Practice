import java.util.*;
class q6
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Number whose table is to be displayed");

		int n = obj.nextInt();

		int i;

		for(i=1;i<=10;i++)
		{
			System.out.println(i + " x " + n + " = " + (i*n));
			System.out.println();
		}

	}
}