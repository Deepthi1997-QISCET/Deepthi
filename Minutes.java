import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,rem=0,min;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		min=num/60;
		rem=num%60;
		System.out.println(min +" "+ rem);
	}
}
