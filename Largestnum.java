import java.util.*;
import java.lang.*;
import java.io.*;
class Largestnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int x=1,y=2,z=3;
	   if ( x > y && x > z )
	   {
      System.out.println("First number is largest");
	   }
     else if ( y > x && y > z )
     {
     System.out.println("Second number is largest");
     }
     else if ( z > x && z > y )
     {
     System.out.println("Third number is largest");
     }
     else
      {
      System.out.println("Entered numbers are not distinct");
      }
		
	}
}
