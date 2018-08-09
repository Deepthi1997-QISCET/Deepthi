import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arminterval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=num1;i<num2;i++)
		{
			int check,rem,sum=0;
			check=i;
			while(check !=0)
			{
				rem=check%10;
				sum=sum+(rem*rem*rem);
				check=check/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
			
