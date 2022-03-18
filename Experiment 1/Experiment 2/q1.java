import java.util.*;
class q1
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int i, j;

		System.out.println("Enter Number of elements");
		int n = obj.nextInt();
		int a[] = new int[n];

		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

		int temp = 0;

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]<=a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		System.out.println("\nSorted Array.");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n\n");

		int b[] = new int[n];

		for(i=0;i<n;i++)
			b[i] = a[n-i-1];

		int c[] = new int[n];

		j = 0;
		int k=0;

		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				c[i] = a[j];
				j++;
			}

			else
			{
				c[i] = b[k];
				k++;
			}
		}

		System.out.println("\nSorted Array in which first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.");
		for(i=0;i<n;i++)
			System.out.print(c[i]+" ");
		System.out.println("\n\n");

	}
}