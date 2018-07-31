import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrome
{
	public static void main(String[] args)throws java.lang.Exception
	{
		int r,sum=0,temp,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
			
