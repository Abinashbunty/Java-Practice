import java.util.*;
class q2
{
	public static void main(String[] args) {
	
	Scanner obj = new Scanner(System.in);

	int num = 0;
	System.out.println("Enter the number of elements in the array.");
	int n = obj.nextInt();
	int a[] = new int[n];
	int b[] = new int[n];
	int i;

	for(i=0;i<n;i++)
	{
		System.out.println("Enter a number.");
		num = obj.nextInt();
	}

	for(i=0;i<n;i++)
	{
		if(a[i]%2==0)
			b[i] = a[i];
		else
			b[n-i-1] = a[i];
	}

	System.out.println("\n");
	System.out.println("The modified array is as follows:-\n\n");
	for(i=0;i<n;i++)
		System.out.print(b[i]+"  ");
	
	System.out.println();

	}

}