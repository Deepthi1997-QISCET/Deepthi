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
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int a[]=new int[10];

		for (int i = 2; i <= number; i++) 
		{
 
                         if (number % i == 0) 
                         {
                            
                            System.out.print(i+" ");
                            number = number / i;
                         }
		}
	}
}
