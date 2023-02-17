Codechef : Sum it

SOLUTION [Java]

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0)
		{
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    if((b+c)==d)
		    {
		        System.out.println("YES");
		    }
	        else
		    {
		        System.out.println("NO");
		    }
		    a--;
		}
		
	}
}
