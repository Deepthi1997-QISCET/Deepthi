/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,temp=1,temp1=1,temp2=1;
		Scanner sc=new Scanner(System.in);
                        n=sc.nextInt();
                        k=sc.nextInt();
                        for(int i=1;i<=n;i++)
                        {
                        	temp=temp*i;
                        }
                        for(int i=1;i<=(n-k);i++)
                        {
                        	temp1=temp1*i;
                        }
                        for(int i=1;i<=k;i++)
                        {
                        	temp2=temp2*i;
                        }
                        System.out.println(temp/(temp2*(temp1)));
	}
}
