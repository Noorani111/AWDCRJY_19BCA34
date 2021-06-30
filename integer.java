import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Integer {
         public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine().trim());
         int c;
             long rev=0;
                   
         if(a>0)
         {while(a>0)
{
            c=a%10;
            rev=(rev*10)c;
            a=a/10;
        }
        System.out.println(""+rev);}
             else
             {
         while(a<0)
        {
            c=a%10;
           rev=(rev*10)+c;
            a=a/10;
        }
        System.out.println(""+rev);}
             }
}

   //Output
  //-123
 //-321