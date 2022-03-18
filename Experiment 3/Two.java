import java.io.*;
class Two
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("/home/matlab/file.txt");
		String s="";
		int i;
		while((i = fr.read())!= -1)
			s+=Character.toString((char)i);
		System.out.println(s);
		for(int j=s.length()-1;j>=0;j--)
			System.out.print(s.charAt(j));
	}
}
