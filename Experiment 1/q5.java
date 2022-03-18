import java.util.*;
class q5
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the number of terms");
		int n = obj.nextInt();

		int i, s=0;

		for(i=1;i<=n;i++)
			s = s + i*i;

		System.out.println("Sum of squares of" + n + " terms = " + s);

	}
}