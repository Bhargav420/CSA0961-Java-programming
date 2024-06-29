import java.util.*;
class shape
{
	public static void main(String arg[]);
	{
	Scanner sc=new Scanner(System.in);
	int radius;
	radius=sc.nextInt();
}
}
class sphere extends shape
{
int area=4*3.14*radius*radius;
int volume=1.3*3.14*radius*radius*radius;
}
class cone extends sphere
{
Scanner sc=new Scanner(System.in);
int length,height;
length=sc.nextInt();
height=sc.nextInt();
int area=3.14*radius*(length+radius);
int volume=0.3*3.14*radius*radius*height;
}
