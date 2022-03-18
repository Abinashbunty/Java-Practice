import java.util.*;
import java.lang.*;
class q1
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		q1 q = new q1();

		System.out.println("Enter the address on which calculation has to be done.");
		String address = obj.next();

		String returened_string = rotate(address);
		System.out.println(returened_string);

		int get_address = q.segement_add(returened_string);

		if(get_address<10)
			System.out.println("\nAddress required = 0"+get_address);
		else
			System.out.println("\nAddress required = "+get_address);
	}


	static String rotate(String a)
	{
		int len = a.length();
		String sub1 = a.substring(0, len-1);
		String sub2 = a.substring(len-1);
		String new_string = sub2 + sub1;
		return new_string;
	}

	int segement_add(String a)
	{
		int l = a.length();
		int no_of_segments = l/2;
		int segments_array[] = new int[no_of_segments];
		int i, j=0;
		int sum = 0;

		for(i=0;i<l;i=i+2)
		{
			String extracted_substring = a.substring(i, i+2);
			segments_array[j] = Integer.parseInt(extracted_substring);
			System.out.print(segments_array[j]+"  ");
			j++;
		}

		for(i=0;i<no_of_segments;i++)
		{
			sum = sum + segments_array[i];
		}

		return sum%100;
	}
}