/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,a=0,x;
		Scanner s=new Scanner(System.in);
		System.out.print("enter any number:");
		n=s.nextInt();
		m=n;
		while(n>0)
		{x=n%10;
		a=a*10+a;
		a=n/10;
		}
		if(a==0)
		{
			System.out.println("Given number "+m+" is palindrome");
		}
		else
		{
			System.out.println("Given number "+m+" is not palindrome");
	}
		}
}
		
		
