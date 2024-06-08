import java.util.*;
class sphere
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int radius;
	double volume;
	System.out.println("enter the radius");
	radius=sc.nextInt();
	volume=4/3*3.14*radius*radius*radius;
	System.out.println("volume"+volume);
}
}
	