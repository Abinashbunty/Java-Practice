import java.io.*;
import java.util.Scanner;
class Three
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("/home/matlab/file.txt");
		fw.write("Name: ABC\n");
		fw.write("ID: 123456\n");
		fw.write("Dept: XYZ\n");
		fw.close();
		
		FileReader fr = new FileReader("/home/matlab/file.txt");
		String s="";
		int i;
		System.out.println("File after writing: \n");
		while((i = fr.read())!= -1)
			System.out.print((char)i);
	}
}
