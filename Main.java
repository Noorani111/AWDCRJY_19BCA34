/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {                                    
	    int l,u;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter range lower and upper bounds:");
	    l=s.nextInt();
		u=s.nextInt();  
		while(l!=u)
		{
	    for(int k=u;k>=l;k--)
	    { if(k%2==0)
	    {
	        System.out.println(k+"");
	    }
	    }
	    break;
		}
	}
}
	        