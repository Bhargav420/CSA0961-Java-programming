import java.util.*;
class vowel
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int count=0,k;
	char ch;
	String b;
	System.out.print("enter the string b");
	b=sc.nextLine();
	for(k=0;k<=6;k++)
{	
	ch=b.charAt(i);
	if(i=='a'|| i=='e'|| i=='i' || i=='o'|| i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
{
	count++;
}
}
	System.out.print(count);
}
}