import java.util.*;
class q4
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the number whose sum is to found from 2 array elements.");
		int num = obj.nextInt();

		System.out.println("Enter the number of array elements.");
		int n = obj.nextInt();
		int a[] = new int[n];
		int i, j;

		for(i=0;i<n;i++)
		{
			System.out.println("Enter a number. (Preferably less than "+num+")");
			a[i] = obj.nextInt();
		}

		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(a[i]+a[j]==num)
					System.out.println(a[i]+" + "+a[j]+" = "+num);
			}
		}
	}
}