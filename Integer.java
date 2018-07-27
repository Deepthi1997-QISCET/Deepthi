import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Integer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={1,3,2,5,4};
		int k=0,i,n=2;
		for(i=0;i<n;i++)
		{
			k=k+a[i];
		}
		System.out.println("sum is" +k);
	}
}
