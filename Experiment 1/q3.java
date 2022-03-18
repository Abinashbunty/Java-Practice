import java.util.*;
class q3
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter 604 for Java Programming");
		System.out.println("Enter 605 for Python programming");

		int ch = obj.nextInt();

		switch(ch)
		{
			case 604:
			System.out.println("Java Programming");
			break;
			case 605:
			System.out.println("Python Programming");
			break;
			default:
			System.out.println("Wrong choice");
		}
	}
}