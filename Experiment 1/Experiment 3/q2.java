import java.util.*;
class q2
{
	public static void main(String[] args) {
		q2 q = new q2();
		Scanner obj = new Scanner(System.in);
		String a[][] = {{"a", "b", "s", "x"}, {"int", "float", "String", "int"}};

		System.out.println("Enter the statement. ");
		String text = obj.next();

		q.format(text);		

	}

	void format(String input)
	{
		int i, j=0, k=0;

		int len = input.length();

		int index_format[] = new int[4];
		int index_comma[] = new int[4];
		char ch = ' ';
		for(i=0;i<len;i++)
		{
			ch = input.charAt(i);
			if(ch=='%')
			{
				index_format[j] = i + 1;
				j++;
			}

			if(ch==',')
			{
				index_comma[k] = i + 1;
				k++;
			}

		}

		for(i=0;i<4;i++)
		{
			if((input.charAt(index_format[i])=='d') && (input.charAt(index_comma[i]=='a')))
				System.out.println("Syntax is correct");
			else if((input.charAt(index_format[i])=='f') && (input.charAt(index_comma[i]=='b')))
				System.out.println("Syntax is correct");
			else if((input.charAt(index_format[i])=='s') && (input.charAt(index_comma[i]=='s')))
				System.out.println("Syntax is correct");
			else if((input.charAt(index_format[i])=='d') && (input.charAt(index_comma[i]=='x')))
				System.out.println("Syntax is correct");
			else
				System.out.println("Syntax is wrong!");
		}
	}
}