import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	     for(int q=1;q<=n;q++)
	    {
	        for(int w=1;w<=q;w++)
	        {
	          System.out.print("*");  
	        }
	        
	        	System.out.println();
	      
	    }
	    for(int i=n-1;i>=1;i--)
	    {
	        for(int j=1;j<=i;j++)
	        {
	          System.out.print("*");  
	        }
	        
	        	System.out.println();
	      
	    }  
              }
}