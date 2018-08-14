import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hourmin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int h1=s.nextInt();
		int m1=s.nextInt();
		int h2=s.nextInt();
		int m2=s.nextInt();
		int h,m;
		if(h1>h2)
		{
			h=h1-h2;
		}
		else
		{
			h=h2-h1;
		}
		if(m1>m2)
		{
			m=m1-m2;
		}
		else
		{
			m=m2-m1;
		}
		System.out.print(h+" "+m);
	}
}
