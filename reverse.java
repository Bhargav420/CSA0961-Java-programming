import java.util.*;
class reverse
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String bhargav= sc.nextLine();
	String vishwa="";
	for(int i=6;i>=0;i--)
	{ vishwa+=bhargav.charAt(i);
	}
	System.out.print(vishwa);
	}
}