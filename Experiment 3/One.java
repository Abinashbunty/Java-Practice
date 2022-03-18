import java.io.*;
class One
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("/home/matlab/file.txt");
		String s="";
		int i;
		while((i = fr.read())!= -1)
			s+=Character.toString((char)i);
		System.out.println(s);
		String[] arr = s.split(" ");
		String fin = "";
		for(String j:arr)
		{
			char c = j.charAt(0);
			String sub = j.substring(1,j.length());
			if(Character.isLowerCase(c))
				c = Character.toUpperCase(c);
			fin+= (c + sub + " ");
		}
		System.out.println(fin);
	}
}
