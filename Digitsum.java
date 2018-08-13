import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Digitsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m, n, sum = 0;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		while(m > 0)
		{
			n = m % 10;
			sum = sum + n;
			m = m / 10;
     }
		System.out.println(sum);
	}
}
