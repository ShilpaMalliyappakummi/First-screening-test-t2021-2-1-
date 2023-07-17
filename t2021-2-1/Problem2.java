import java.util.Scanner;
import java.util.ArrayList;
class Problem2
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("Enter input value");
int a=sc.nextInt();
int i=0,j=0;
while(j<a)
{
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


