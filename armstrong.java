import java.util.*;
class armstrong
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int n,i;
	int k=0;
	n=sc.nextInt();
	int org=n;
	while(n!=0)
	{
	int remainder=n%10;
	k+=Math.pow(remainder,3);
	n=n/10;
	}
	if(k==org)
	{
	System.out.print("it is armstrong");
	}
	else
	{
	System.out.print("it is  not armstrong");
}
}
}
	