import java.util.*;
class q2
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number for divisibility check");
		int n = obj.nextInt();

		if((n%5==0) && (n%3==0))
			System.out.println("Number is divisibile by both 3 and 5");
		else
			System.out.println("Number is not divisibile by both 3 and 5");
	}
}