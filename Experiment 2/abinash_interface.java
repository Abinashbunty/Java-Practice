interface Numbers
{
public int process(int x,int y);
}
class Sum implements Numbers
{
public int process(int x,int y)
{
return(x+y);
}
}
class Average implements Numbers
{
public int process(int x,int y)
{
return((x+y)/2);
}
}
class abinash_interface
{
public static void main(String args[])
{
int a,b;
Sum add=new Sum();
a=add.process(15,20);
System.out.println("Your Sum is:"+a);
Average avg=new Average();
b=avg.process(46,74);
System.out.println("Your Average is:"+b);
}
}