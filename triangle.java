import java.util.*;
class triangle
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int breadth,height;
	double area;
	System.out.println("enter the breadth and height");
	breadth=sc.nextInt();
	height=sc.nextInt();
	area=0.5*breadth*height;
	System.out.println("area"+area);
}
}
	