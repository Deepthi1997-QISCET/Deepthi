import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PowerTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		if(isPowerOfTwo(num))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	private static boolean isPowerOfTwo(int num)
	{
		if(num<=0)
		{
			return false;
			
		}
		while(num > 1)
		{
			if(num % 2 != 0)
			{
				return false;
				
			}
			num = num / 2;
		}
			return true;
	}
}

	
   
 
