import java.io.*;
class Five
{
	public static void main(String[] args) throws IOException
	{
		int i,count=0;
		String writingString = "Hello World";
		File f = new File("/home/matlab/NewFile.txt");
		FileWriter fw = new FileWriter(f);
		fw.write(writingString);
		fw.close();
		FileReader fr = new FileReader(f);
		while((i = fr.read())!= -1)
			count++;
		System.out.println("Number of characters in new file: "+count);
	}
}
