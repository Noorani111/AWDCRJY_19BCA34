class EnOprint
{
public static void main(String args[])
{
int m=2465317,r,i=0,j=0;
int a[]=new int[25];
int b[]=new int[25];
while(m>0)
{
r=m%10;
if(r%2==0)
{
a[i]=r;
i++;
}
else
{
b[j]=r;
j++;
}
m=m/10;
}
for(int k=0;k<i;k++)
System.out.print("even numbers are :"a[k]+ " ");
System.out.println();
for(int k=0;k<j;k++)
System.out.print("odd numbers are :"b[k]+ " ");
}
}

//Output
//even numbers are:2 4 6
//odd numbers are:5 3 1 7