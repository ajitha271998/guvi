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
		int i,a,count=0;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			count++;
		}
		++count;
		System.out.println(count);
		
		
	}
}
