
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Naturalnosum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 10, count, total = 0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(count = 1; count <= num; count++)
		{
			total = total + count;
		}
		System.out.println(total);
    }
}
