import java.util.*;
class circle
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int radius;
	double area;
	System.out.println("enter the radius");
	radius=sc.nextInt();
	area=3.14*radius*radius;
	System.out.println("area of circle"+area);
}
}