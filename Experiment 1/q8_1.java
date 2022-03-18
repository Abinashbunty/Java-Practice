import java.util.*;
class q8_1
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int i, j;

		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print("*  ");
			System.out.println("\n");
		}
	}
}