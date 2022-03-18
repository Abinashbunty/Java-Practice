import java.io.*;
class Four
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("/home/matlab/file.txt");
		String s="";
		int i;
		System.out.println("File content before writing:");
		while((i = fr.read())!= -1)
			s+=Character.toString((char)i);
		System.out.println(s);
		String fin = "";
		for(int j=0;j<s.length();j++)
		{
			fin+=Character.toLowerCase(s.charAt(j));
		}
		
		FileWriter fw = new FileWriter("/home/matlab/file.txt");
		fw.write(fin);
		fw.close();
		
		FileReader fr2 = new FileReader("/home/matlab/file.txt");
		System.out.println("File content after writing: \n");
		while((i = fr2.read())!= -1)
			System.out.print((char)i);
	}
}
