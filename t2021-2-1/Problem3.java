import java.util.Scanner;
import java.util.ArrayList;
class Problem3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter input value");
int a=sc.nextInt();
ArrayList al=new ArrayList();
int i=0,j=0;
while(j<a)
{
if(a%2==0)
{
a--;
}
if(i%2!=0)
{
j++;
al.add(i);
}
i++;
}
System.out.println(al);
}
}
