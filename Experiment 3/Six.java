import java.io.*;
class Six
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("/home/matlab/file1.txt");
		String s1="";
		int i;
		while((i = fr.read())!= -1)
			s1+=Character.toString((char)i);
		
	}
}
