import java.util.*;
class q4
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the number of terms");
		int n = obj.nextInt();

		int i, s=0;

		for(i=1;i<=n;i++)
			s = s + i;

		System.out.println("Sum of " + n + " terms = " + s);

	}
}