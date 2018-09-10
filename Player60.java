/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		for(int i = 0;i < s1.length();i++)
		{
			for(int j =0;j < s2.length();j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count>0)
		{
				System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
    }
}
