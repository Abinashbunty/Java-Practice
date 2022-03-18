import java.util.*;
class q3
{
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter number of array elements.");
		int n = obj.nextInt();

		int i, j;
		int a[] = new int[n];

		for(i=0;i<n;i++)
		{
			System.out.println("Enter a number.");
			a[i] = obj.nextInt();
		}

		int temp = 0;

		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>=a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		int count=0, l = 0;

		for(i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}

			else
				l++;
		}

		System.out.println("\nLength of new array = "+l);
	}
}