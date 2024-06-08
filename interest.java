import java.util.*;
class interest
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int p,t;
	double interest,r;
	System.out.println("enter the principle time and rate of interest");
	p=sc.nextInt();
	t=sc.nextInt();
	r=sc.nextDouble();
	interest=p*t*r/100;
	System.out.println("interest"+interest);
}
}
	