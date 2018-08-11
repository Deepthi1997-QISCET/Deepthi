import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String c=s.next();
		String c1=s.next();
		if(c.length()>c1.length())
		{
			System.out.println(c);
		}
		else if(c.length()<c1.length())
		{
			System.out.println(c1);
		}
		else
		{
			System.out.println(c1);
		}
	}
}
