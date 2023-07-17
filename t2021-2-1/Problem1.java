import java.util.Scanner;
class Problem1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value : ");
double a=sc.nextDouble();
System.out.println("Enter b value : ");
double b=sc.nextDouble();
double result;
String operation=sc.next();
switch(operation)
{
case "Addition":
result = a+b;
System.out.println(result);
break;
case "Subtraction":
result = a-b;
System.out.println(result);
break;
case "Multiplication":
result = a*b;
System.out.println(result);
break;
case "Division":
result = a/b;
System.out.println(result);
break;
}
}
}

