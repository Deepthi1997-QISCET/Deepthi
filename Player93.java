/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n,temp;
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		if(n%2==0)
		{
			for(int i=0;i<n;)
			{
				for(int j=i+1;j<n;)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					i++;
					j++;
					j++;
				}
			}
		}
		if(n%2!=0)
		{
			for(int i=0;i<n-1;)
			{
				for(int j=i+1;j<n-1;)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					i++;
					j++;
					j++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
