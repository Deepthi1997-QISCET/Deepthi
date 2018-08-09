import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeInterval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int low,high;
		Scanner s=new Scanner(System.in);
		low=s.nextInt();
		high=s.nextInt();
		while(low<high)
		{
			boolean b=false;
			for(int i=2;i<=low/2;i++)
			{
				if(low%i==0)
				{
					b=true;
					break;
				}
			}
			if(!b)
			{
				System.out.println(low + " ");
			}
			low++;
		}
	}
}
