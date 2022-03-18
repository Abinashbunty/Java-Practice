import java.util.*;
 
interface Exam
{
	boolean Pass(int mark);
}
 
interface Classify
{
	String Division(int avg);
}
 
class Result implements Exam,Classify
{
	public boolean Pass(int mark)
	{
			if(mark>=50)
				return true;
			else
				return false;
	}
 
	public String Division(int avg)
	{
		if(avg>=60)
			return "First";
		else if(avg>=50)
			return "Second";
		else
			return "No-Division";
	}	
}
 
public class result_abinash {
	public static void main(String[] args) {
		boolean pass;
		int mark,avg;
		String division;
		Scanner in = new Scanner(System.in);
		Result res=new Result();
		try
		{
			System.out.println("Enter the mark : ");
			mark=in.nextInt();
			System.out.println("Enter the average : ");
			avg=in.nextInt();
			pass=res.Pass(mark);
			division=res.Division(avg);
			if(pass)
				System.out.println("Passed - "+ division + ".");
			else
				System.out.println("Failed - " + division+ ".");
		}
		catch(Exception e)
		{
			System.out.println("Error : " + e);
		}
	}
}