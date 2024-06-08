import java.util.*;
class celsius
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	double celsius,fahren;
	System.out.println("enter the fahrenheit value");
	fahren=sc.nextDouble();
	celsius=(fahren*5/9)-32;
	System.out.println("celsius"+celsius);
}
}