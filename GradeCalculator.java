import java.util.*;
class GradeCalculator
{
public static void main(String arg[])
{
System.out.println("***GRADE CALCULATOR***");
Scanner sc=new Scanner(System.in);
System.out.println(" Enter marks of 1st subject(out of 100)");
float a=sc.nextFloat();
System.out.println(" Enter marks of 2nd subject(out of 100)");
float b=sc.nextFloat();
System.out.println(" Enter marks of 3rd subject(out of 100)");
float c=sc.nextFloat();
System.out.println(" Enter marks of 4th subject(out of 100)");
float d=sc.nextFloat();
System.out.println(" Enter marks of 5th subject(out of 100)");
float e=sc.nextFloat();
System.out.println(" Enter marks of 6th subject(out of 100)");
float f=sc.nextFloat();

float Total = a+b+c+d+e+f;
float percentage=Total/6;

System.out.println(percentage);


if(percentage>90)
{
System.out.println(" grade A");
}
else if(percentage>80 && percentage<90)
{
System.out.println(" grade B");
}
else if(percentage>70 && percentage<80)
{
System.out.println(" grade C");
}
else if(percentage>35 && percentage<70)
{
System.out.println("average");
}
else
{
System.out.println(" Failed");
}
}
}